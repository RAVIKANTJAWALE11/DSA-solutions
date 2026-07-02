# 📂 Directory Structure Documentation

Complete guide to repository organization and file structure.

---

## 🎯 Root Level Files

```
DSA-solutions/
├── README.md                    # Main documentation (this is your entry point)
├── SETUP_GUIDE.md              # Browser extensions setup instructions
├── PROGRESS.md                 # Progress tracking and statistics
├── DIRECTORY_STRUCTURE.md      # This file
├── .gitignore                  # Git ignore rules
└── stats.json                  # Auto-generated statistics by extensions
```

---

## 📁 Main Directories

### `leetcode/`
**LeetCode problems - Managed by LeetHub v2**

```
leetcode/
├── 0001-two-sum/
│   ├── 0001-two-sum.java              # Solution code
│   ├── README.md                       # Problem statement
│   └── .DS_Store                       # (auto-generated, ignored)
│
├── 0014-longest-common-prefix/
│   ├── 0014-longest-common-prefix.java
│   ├── README.md
│   └── ...
│
├── 0073-set-matrix-zeroes/
│   ├── 0073-set-matrix-zeroes.java
│   ├── README.md
│   └── ...
│
└── ... (other problems)

Structure by LeetHub:
- Problem ID: 0001, 0014, 0073, etc.
- Problem Name: converted to kebab-case
- Solution Format: [id]-[name].java
```

**How Files are Named:**
```
Problem: #1. Two Sum
Folder: 0001-two-sum/
File: 0001-two-sum.java
README: README.md (auto-generated with problem statement)
```

**File Naming Patterns:**
- Leading zeros for problem IDs: `0001`, `0014`, `0073`
- Kebab-case for names: `two-sum`, `longest-common-prefix`
- Java files: `[id]-[name].java`

---

### `gfg/`
**GeeksforGeeks problems - Managed by GfG to GitHub Extension**

```
gfg/
├── problem-1/
│   ├── solution.java
│   ├── README.md
│   └── ...
│
├── problem-2/
│   ├── solution.java
│   ├── README.md
│   └── ...
│
└── ... (other problems)

Format varies by GfG extension version
```

**Expected Structure:**
- Folder: Problem title or ID
- Solution: `solution.java` or `[name].java`
- Details: `README.md` with problem description
- Company tags: May be included in metadata

**Note:** Structure depends on extension version. Check your repo after first GfG submission.

---

### `codeforces/`
**Codeforces problems - Managed by CFPusher**

```
codeforces/
├── 4/                          # Contest ID
│   ├── A - Watermelon/         # Problem letter and name
│   │   ├── solution.java
│   │   └── solution_brief.md
│   ├── B - Some Problem/
│   │   └── ...
│   └── ...
│
├── 500/
│   ├── A - Problem/
│   └── ...
│
└── ... (other contests)

Organized by Contest ID -> Problem
```

**File Structure:**
```
codeforces/[contest-id]/[problem-letter] - [problem-name]/
├── solution.java           # Main solution
└── solution_brief.md       # Problem summary
```

**Rating Organization:**
- Problems auto-organized by Codeforces rating
- Same contest may have multiple problems
- Problem letter indicates position (A, B, C, D, etc.)

---

## 📋 File Naming Conventions

### LeetCode Files
```
Folder: [XXXX]-[kebab-case-name]
Code: [XXXX]-[kebab-case-name].java
Example: 0001-two-sum.java

Where [XXXX] = problem number with leading zeros
```

### GfG Files
```
Folder: [problem-title-or-id]
Code: solution.java or [name].java
Example: solution.java

Varies by extension - check after first sync
```

### Codeforces Files
```
Folder: [contest-id]/[letter] - [Problem Name]
Code: solution.java
Example: 4/A - Watermelon/solution.java

Contest ID = Contest number
Letter = Problem position in contest (A, B, C, ...)
```

---

## 📄 README.md Files

Each problem folder contains a `README.md` with:

**LeetCode READMEs:**
- Problem statement (HTML formatted)
- Problem number and difficulty
- Examples with input/output
- Constraints
- Follow-up questions

**GfG READMEs:**
- Problem description
- Input/Output format
- Sample test cases
- Difficulty level
- Company tags (if available)

**Codeforces files:**
- Usually `solution_brief.md`
- Contest ID and problem letter
- Problem link
- Rating/difficulty

---

## 🔄 Auto-Generation by Extensions

### What Extensions Create:

**LeetHub:**
- Folder per problem
- Java solution file
- README with problem description
- Automatic commit on submission

**GfG Extension:**
- Folder per problem
- Solution file
- Problem details in README
- Auto-commit on submission

**CFPusher:**
- Contest folder
- Problem subfolder
- Solution file
- Brief description file
- Auto-commit

### What You Should NOT Edit:

- READMEs (extensions regenerate them)
- Folder names (extensions may fail to sync)
- Commit history (auto-generated)

### What You CAN Edit:

- Solution code (add comments, optimize)
- Add additional files (notes, alternative solutions)
- Create personal folders for learning materials

---

## 🗂️ Manual Organization Tips

### Adding Personal Notes

```
leetcode/0001-two-sum/
├── 0001-two-sum.java       # Original solution
├── README.md               # Auto-generated
├── NOTES.md                # ✅ Your personal notes
├── alternative_solution.java  # ✅ Alternative approach
└── complexity_analysis.md  # ✅ Your analysis
```

### Organizing by Difficulty (Optional)

If you want to track progress:
```
PROGRESS_TRACKER/
├── easy_solved.md
├── medium_solved.md
├── hard_solved.md
└── topics.md
```

### Creating Topic Collections

```
COLLECTIONS/
├── arrays_and_matrices.md
├── strings.md
├── trees_and_graphs.md
└── dynamic_programming.md
```

---

## 📊 Stats Files

### `stats.json`
Auto-generated by extensions containing:
- Problem counts by difficulty
- SHAs of created files
- Submission timestamps
- Platform statistics

**Example structure:**
```json
{
  "leetcode": {
    "easy": 8,
    "medium": 3,
    "hard": 0,
    "shas": {
      "0001-two-sum": {
        "0001-two-sum.java": "557ee9...",
        "README.md": "295832..."
      }
    }
  },
  "codeforces": {
    "easy": 1,
    "shas": {
      "4": {
        "A - Watermelon": "..."
      }
    }
  }
}
```

**Note:** Don't manually edit stats.json; extensions manage it.

---

## 🔍 Finding Solutions

### By Difficulty
```bash
# Find all easy problems from LeetCode
ls leetcode/ | grep "^0[0-3]" | head -5

# Count by level (check PROGRESS.md for mapping)
find leetcode -name README.md | xargs grep -l "Easy" | wc -l
```

### By Topic
```bash
# Find array problems
find . -name README.md | xargs grep -l "Array" | head -10

# Find string problems
find . -name README.md | xargs grep -l "String" | head -10
```

### By Platform
```bash
# List all LeetCode solutions
ls -la leetcode/

# List all GfG solutions
ls -la gfg/

# List all Codeforces solutions
ls -la codeforces/
```

### By Pattern
```bash
# Find medium difficulty LeetCode problems
find leetcode -name README.md | xargs grep -l "Medium" | wc -l

# Find all matrix problems
find . -name README.md | xargs grep -l "Matrix" | head -10
```

---

## 🚀 Maintenance

### Regular Tasks

**Weekly:**
- Pull latest changes: `git pull`
- Review new submissions
- Update PROGRESS.md

**Monthly:**
- Review stats.json
- Organize personal notes
- Clean up duplicate attempts
- Update README with new milestones

### Cleanup Commands

```bash
# See recent commits
git log --oneline -20

# Check file structure
find . -type f -name "*.java" | wc -l

# Find directories with no solutions yet
find . -type d -size 0

# Verify extension sync
git diff --stat HEAD~5 HEAD
```

---

## ⚠️ Important Notes

### Don't Break Auto-Sync:
- ❌ Don't rename folders (extensions expect specific names)
- ❌ Don't delete README.md (extensions regenerate them)
- ❌ Don't change folder structure while extensions are active
- ✅ DO add comments to solution files
- ✅ DO create additional tracking files

### File Conflicts:
- If extension can't find expected folder, it creates a new one
- May result in duplicate folders: `problem_1`, `problem_1_1`, etc.
- Merge manually if this happens

### Backup Strategy:
- Pull regularly: `git pull`
- Local backups: `git clone` to another folder
- Remote backup: GitHub already keeps history

---

## 📈 Growth Timeline

```
Month 1:
└── leetcode/
    ├── 0001-two-sum/
    ├── 0014-longest-common-prefix/
    └── ... (more problems)

Month 2:
├── leetcode/
│   ├── ... (15-20 problems)
│   └── ... 
├── gfg/
│   ├── problem-1/
│   └── ... (first GfG problems)
└── PROGRESS.md (updated)

Month 3:
├── leetcode/
│   ├── ... (30+ problems)
│   └── COLLECTIONS/ (optional organization)
├── gfg/
│   ├── ... (10+ problems)
│   └── ...
├── codeforces/
│   ├── 4/
│   ├── 500/
│   └── ... (more contests)
└── PROGRESS.md (detailed tracking)
```

---

## 🎯 Quick Reference

| Task | Command | Location |
|------|---------|----------|
| Add LeetCode solution | Solve on LeetCode | Auto-created in `leetcode/` |
| Add GfG solution | Solve on GfG | Auto-created in `gfg/` |
| Add Codeforces solution | Submit on CF | Auto-created in `codeforces/` |
| View progress | `cat PROGRESS.md` | Root |
| Update tracking | Edit manually | `PROGRESS.md` |
| View statistics | `cat stats.json` | Root |
| Pull latest | `git pull` | Any directory |

---

**Last Updated**: July 2, 2026

For more info, see README.md or SETUP_GUIDE.md
