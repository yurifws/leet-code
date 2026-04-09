# Clarification Gate

A checklist to complete before writing any code, and rules for when seeking help is acceptable.

---

## Pre-Solve Checklist

Before touching the keyboard, answer these:

**Input & Constraints**
- [ ] What are the input types and ranges? (negative numbers? empty arrays? null?)
- [ ] What is the size of the input? Does it affect the target complexity?
- [ ] Is the input sorted? Can it have duplicates?

**Output**
- [ ] What exactly should be returned? (index? value? count? boolean?)
- [ ] Are there multiple valid answers? If so, is any one acceptable?

**Edge Cases**
- [ ] What happens with an empty input?
- [ ] What happens with a single element?
- [ ] What happens at the boundaries (first/last element, min/max value)?

**Approach**
- [ ] Can I identify the pattern? (sliding window, two pointers, BFS, DP, etc.)
- [ ] What is the brute force solution and its complexity?
- [ ] Can I do better? What is the bottleneck?

---

## Hint Rules

**Time limits before seeking help:**

| Difficulty | Time to attempt before hints |
|---|---|
| Easy | 20 minutes |
| Medium | 40 minutes |
| Hard | 60 minutes |

**Allowed hint progression (in order):**

1. Re-read the problem statement — often the key constraint was missed.
2. Look only at the topic tag on LeetCode.
3. Read the first hint only, then try again.
4. Read the editorial approach (not the code).
5. Read the solution code as a last resort.

**After using a hint:**
- Note which step you needed in a comment or personal log.
- Re-solve the problem from scratch without looking at the hint.
- Revisit the problem within one week without hints.