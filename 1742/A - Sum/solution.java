import java.util.*;
 
public class Main {
 
    static Scanner sc = new Scanner(System.in);
 
    public static void main(String[] args) {
 
        int t = 1;
        t = sc.nextInt(); // Uncomment for multiple test cases
 
        while (t-- > 0) {
            solve();
        }
    }
 
    static void solve() {
 
       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();
       if(a+b==c || b+c==a || c+a == b) System.out.println("YES");
       else  System.out.println("NO");
    }
}