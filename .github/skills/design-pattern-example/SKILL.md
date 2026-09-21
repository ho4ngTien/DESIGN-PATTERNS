---
name: design-pattern-example
description: "Use when: adding a new GoF design pattern example to this repository, creating a package README, Java demo, tests, and UML docs, or standardizing an existing pattern implementation."
---

# Design Pattern Example Workflow

Use this skill when you are adding or refining a GoF design pattern in this repository.

## Objective

Create a small, isolated, understandable example that proves why a design pattern exists, documents the trade-offs, and fits the repository's teaching format.

## Workflow

1. Review repository conventions
   - Read the project README and the pattern README template in `docs/pattern-readme-template.md`.
   - Inspect one or two existing examples in the same category (for example, `singleton`, `builder`, or `strategy`).
   - Match the package naming, class layout, testing style, and documentation structure.

2. Define the design pressure
   - State the real problem the pattern solves.
   - Explain the naive solution and the cost of not using the pattern.
   - Keep the example narrow and focused; do not broaden into unrelated concerns.

3. Create the package structure
   - Use the repository's package naming pattern: `com.hoangtien.designpatterns.<category>.<pattern>`.
   - Keep the example independent from other pattern packages.
   - Add the Java implementation and any demo or runner class in the same package.

4. Implement the example
   - Prefer plain Java and minimal dependencies.
   - Keep each class responsible for a single concern.
   - Make the behavior easy to observe and validate with a small, readable API.

5. Add tests
   - Use JUnit 5.
   - Validate the actual behavior, not just object creation.
   - Cover the main scenario and the most important edge case.

6. Write README documentation
   - Use the repo template.
   - Include the pattern problem, the solution, trade-offs, and when to use it.
   - Explain why the naive version is not ideal and what this pattern improves.

7. Add UML documentation
   - Store the PlantUML file under `docs/uml/<category>/`.
   - Keep the diagram aligned with the actual code structure.
   - Do not add extra abstractions that the implementation does not use.

8. Validate the result
   - Run the relevant Maven checks, typically `mvn test` for the repository.
   - Confirm the package compiles and the example runs as expected.
   - Check that the README, classes, and UML all describe the same implementation.

## Decision Points

- If the pattern already exists, update the implementation or docs instead of creating a duplicate package.
- If the pattern is too broad, reduce it to the smallest realistic example that demonstrates the design pressure.
- If tests are missing, add behavior-based tests before finalizing documentation.
- If the README drifts from the code, fix the documentation first so the example remains accurate.
- If a pattern is planned but not started, follow the repository's Phase-based roadmap and keep the example isolated from unrelated work.

## Completion Criteria

A pattern example is complete only when all of the following are true:

- The Java package exists and compiles.
- The example demonstrates the real design pressure clearly.
- JUnit 5 tests cover the core behavior.
- The README follows the repository template and explains the trade-offs.
- UML reflects the implementation accurately.
- The code remains small, readable, and independent from other pattern packages.

## Example prompts

- "Add the Prototype pattern to the repository using the project’s pattern workflow."
- "Create a new design pattern example for Adapter with README, Java code, and tests."
- "Refine the Strategy example so its README, demo, and tests all match the repository conventions."
- "Standardize this pattern package to the repo's documentation and testing format."

## Related customizations

- Create a repo-level instruction for Java pattern conventions.
- Create a separate skill for adding UML diagrams or pattern READMEs.
- Add a prompt for generating a new pattern package from a template.
