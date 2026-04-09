# Constitution

## Principles

1. **Solve it yourself first.** Attempt every problem before looking at hints or solutions.
2. **Understand before moving on.** If a solution is wrong, understand why before fixing it.
3. **One problem at a time.** Finish a problem — including tests — before starting the next.
4. **Prefer clarity over cleverness.** Write code that is easy to read and reason about.

## Problem Workflow

1. Read the problem and constraints carefully.
2. Identify the topic/pattern (binary search, sliding window, DP, etc.).
3. Write the solution in the correct package under `src/main/java/solutions/`.
4. Write at least one test per example case from the problem statement.
5. Run `mvn test -Dtest=P{number}_{Name}Test` and confirm all tests pass.
6. Fill in the Time and Space complexity in the class header.
7. Commit with message `P{number}_{Problem Name}`.

## Code Standards

- Use the template files `P0_Default.java` / `P0_DefaultTest.java` as starting points.
- The solution class header must include difficulty, link, description, and complexity.
- Test methods are named `case1()`, `case2()`, etc. — one per example.
- No external libraries. Standard Java only.

## Complexity Goals

| Difficulty | Target |
|---|---|
| Easy | O(n) time or better |
| Medium | O(n log n) or better |
| Hard | Best known complexity |

Brute force is acceptable as a first pass, but aim to optimize before committing.