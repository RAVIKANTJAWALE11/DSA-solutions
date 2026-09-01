class Solution {
    public int minMoves(String[] classroom, int energy) {
        int m = classroom.length;
        int n = classroom[0].length();
        
        int startR = -1, startC = -1;
        List<int[]> litters = new ArrayList<>();
        
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                char ch = classroom[r].charAt(c);
                if (ch == 'S') {
                    startR = r;
                    startC = c;
                } else if (ch == 'L') {
                    litters.add(new int[]{r, c});
                }
            }
        }
        int k = litters.size();
        if (k == 0) return 0; 
        int targetMask = (1 << k) - 1;
        int[][] litterIdx = new int[m][n];
        for (int i = 0; i < m; i++) Arrays.fill(litterIdx[i], -1);
        for (int i = 0; i < k; i++) {
            litterIdx[litters.get(i)[0]][litters.get(i)[1]] = i;
        }
        int[][][] bestEnergy = new int[m][n][1 << k];
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                for (int mask = 0; mask < (1 << k); mask++) {
                    bestEnergy[r][c][mask] = -1;
                }
            }
        }
        Queue<int[]> queue = new LinkedList<>();
        int initialMask = 0;
        if (classroom[startR].charAt(startC) == 'L') {
            int idx = litterIdx[startR][startC];
            initialMask |= (1 << idx);
        }
        
        if (initialMask == targetMask) return 0;
        
        queue.offer(new int[]{startR, startC, initialMask, energy});
        bestEnergy[startR][startC][initialMask] = energy;
        
        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        int steps = 0;
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            steps++;
            
            for (int i = 0; i < size; i++) {
                int[] curr = queue.poll();
                int r = curr[0];
                int c = curr[1];
                int mask = curr[2];
                int e = curr[3];
                if (e == 0) continue;
                
                for (int[] d : dirs) {
                    int nr = r + d[0];
                    int nc = c + d[1];
                    
                    if (nr < 0 || nr >= m || nc < 0 || nc >= n) continue;
                    char cell = classroom[nr].charAt(nc);
                    if (cell == 'X') continue;
                    
                    int nextE = e - 1;
                    int nextMask = mask;
                    
                    if (cell == 'R') {
                        nextE = energy; 
                    } else if (cell == 'L') {
                        int idx = litterIdx[nr][nc];
                        if (idx != -1) {
                            nextMask |= (1 << idx);
                        }
                    }
                    
                    if (nextMask == targetMask) {
                        return steps;
                    }
                    
                    if (nextE > bestEnergy[nr][nc][nextMask]) {
                        bestEnergy[nr][nc][nextMask] = nextE;
                        queue.offer(new int[]{nr, nc, nextMask, nextE});
                    }
                }
            }
        }
        
        return -1;
    }
}