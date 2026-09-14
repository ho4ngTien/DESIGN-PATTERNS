# Builder Pattern

## 1. Problem

`UserProfile` has required fields and several optional fields. A constructor with many parameters is difficult to read and easy to misuse.

## 2. Without Builder

Overloaded constructors multiply as optional fields grow. A telescoping constructor also makes calls full of positional values.

## 3. Solution

Builder collects named configuration steps and creates one immutable object at the end.

## 4. Structure

- `UserProfile`: immutable product.
- `Builder`: fluent construction object.
- Required values are supplied at builder creation; optional values use named methods.

## 5. Implementation

`build()` copies the builder state into final fields. The result cannot be changed after construction.

## 6. Example

Run `BuilderDemo` and compare the readable chain with a long positional constructor.

## 7. When to Use

Use it for immutable objects with multiple optional values, validation, or meaningful construction steps.

## 8. When NOT to Use

Do not add a builder to a tiny object with one or two obvious constructor arguments.

## 9. Advantages

- Makes construction readable.
- Supports optional values without constructor explosion.
- Produces immutable results.

## 10. Disadvantages

- Adds a builder type and more code.
- Validation must be deliberately placed in the builder or product.

## 11. Related Patterns

Factory Method chooses a product type. Prototype creates a new object by copying an existing one.

## 12. UML

See [builder.puml](../../../../../docs/uml/creational/builder.puml).

## 13. Key Takeaway

Builder separates readable configuration from the final immutable object construction.
