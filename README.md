# ☕ LeetCode Solutions — Java

A structured Java project to track and commit LeetCode solutions.

## 📁 Project Structure

```
src/
├── main/java/solutions/
│   ├── arrays/           → Array problems
│   ├── strings/          → String problems
│   ├── linkedlist/       → Linked List problems
│   ├── trees/            → Tree / BST problems
│   ├── graphs/           → Graph / BFS / DFS
│   ├── dp/               → Dynamic Programming
│   ├── math/             → Math problems
│   ├── backtracking/     → Backtracking
│   ├── twopointers/      → Two Pointers
│   ├── slidingwindow/    → Sliding Window
│   ├── binarysearch/     → Binary Search
│   ├── stack/            → Stack / Monotonic Stack
│   └── heap/             → Heap / Priority Queue
└── test/java/solutions/  → Unit tests
```

## 🗂️ Naming Convention

```
P{number}_{ProblemName}.java
```

Example: `P1_TwoSum.java`, `P42_TrappingRainWater.java`

## 🚀 Getting Started

**Requirements:** Java 17+, Maven

```bash
# Run all tests
mvn test

# Compile only
mvn compile
```

## 📝 Solution Template

```java
package solutions.arrays; // change package as needed

/**
 * #{number} - {Problem Name}
 * Difficulty: Easy | Medium | Hard
 * Link: https://leetcode.com/problems/{slug}/
 *
 * {Brief description}
 *
 * Time:  O(?)
 * Space: O(?)
 */
public class P{number}_{ProblemName} {
    public ReturnType methodName(params) {
        // your solution
    }
}
```

## 📊 Progress

| Category       | Solved |
|----------------|--------|
| Arrays         | 5      |
| Strings        | 0      |
| Linked List    | 3      |
| Trees          | 6      |
| Graphs         | 0      |
| Dynamic Prog.  | 0      |
| Math           | 0      |
| Backtracking   | 0      |
| Two Pointers   | 3      |
| Sliding Window | 2      |
| Binary Search  | 1      |
| Stack          | 3      |
| Heap           | 2      |
| **Total**      | **25** |
