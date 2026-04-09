# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Commands

```bash
# Run all tests
mvn test

# Compile only
mvn compile

# Run a single test class
mvn test -Dtest=P704_Binary_SearchTest

# Run a specific test method
mvn test -Dtest=P704_Binary_SearchTest#case1
```

## Architecture

Maven project (Java 17, JUnit 5). Solutions live under `src/main/java/solutions/` in topic-based packages; tests live under `src/test/java/solutions/` (flat, no subpackages).

**Shared utilities** in `solutions.utils`:
- `ListNode` — singly-linked list node used by all linked list problems
- `TreeNode` — binary tree node used by all tree problems
- `MinStack` — helper class for P155

## Conventions

**File naming:** `P{number}_{ProblemName}.java` — e.g., `P704_Binary_Search.java`

**Package:** matches the topic category (e.g., `solutions.binarysearch`, `solutions.trees`)

**Solution class header:**
```java
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
```

**Test class:** placed in `package solutions;` (root test package), imports the solution class, instantiates it as `private final P{number}_{Name} solution = new P{number}_{Name}();`, and uses `@Test void case1()`, `case2()`, etc.

**Template files:** `P0_Default.java` and `P0_DefaultTest.java` serve as copy-paste starting points for new problems.

## Problem Workflow

When adding a new problem, follow this order:

1. Run through `clarification_gate.md` — constraints, edge cases, approach.
2. Copy `P0_Default.java` → correct package; copy `P0_DefaultTest.java` → `src/test/java/solutions/`.
3. Rename files and class to `P{number}_{ProblemName}`.
4. Implement the solution; fill in the class header (difficulty, link, description, complexity).
5. Write one test method per example case (`case1()`, `case2()`, …).
6. Run `mvn test -Dtest=P{number}_{Name}Test` — all tests must pass.
7. Update `spec.md` — move problem from backlog to the progress table, increment total.
8. Commit: `git commit -m "P{number}_{Problem Name}"`.

**Supporting docs:**
- `constitution.md` — principles and complexity targets
- `clarification_gate.md` — pre-solve checklist and hint rules
- `spec.md` — living progress tracker and backlog

## Topic packages

| Package | Category |
|---|---|
| `arrays` | Arrays |
| `strings` | Strings |
| `linkedlist` | Linked List |
| `trees` | Trees / BST |
| `graphs` | Graph / BFS / DFS |
| `dp` | Dynamic Programming |
| `math` | Math |
| `backtracking` | Backtracking |
| `twopointers` | Two Pointers |
| `slidingwindow` | Sliding Window |
| `binarysearch` | Binary Search |
| `stack` | Stack / Monotonic Stack |
| `heap` | Heap / Priority Queue |
