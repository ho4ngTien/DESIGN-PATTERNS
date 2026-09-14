# Singleton Pattern

## 1. Problem

Some application-wide resources should have one coordinated instance, such as a small in-memory configuration registry. Creating independent copies can produce conflicting values.

## 2. Without Singleton

A public constructor allows every caller to create a separate configuration object. Callers can then read different values depending on which instance they received.

## 3. Solution

Singleton hides construction and exposes one shared access point. This example uses the initialization-on-demand holder idiom, which is lazy and thread-safe through class initialization.

## 4. Structure

- `ApplicationConfiguration`: the single instance and its configuration state.
- `getInstance()`: the global access point.
- `SingletonDemo`: an isolated runnable example.

## 5. Implementation

The private constructor prevents external construction. The nested holder creates the instance only when `getInstance()` is first called.

## 6. Example

Run `SingletonDemo` to set a value through one reference and read it through another.

## 7. When to Use

Use it only when one shared instance is an explicit invariant and the shared state is easy to reason about.

## 8. When NOT to Use

Do not use it as a default replacement for dependency injection or to hide mutable global state.

## 9. Advantages

- Enforces a single instance.
- Lazy and thread-safe initialization.
- Simple access for genuinely application-wide state.

## 10. Disadvantages

- Global access increases coupling.
- Mutable state can make tests order-dependent.
- It hides the dependency from a class constructor.

## 11. Related Patterns

Factory Method can centralize creation without imposing one instance. Facade can provide a simpler API without global state.

## 12. UML

See [singleton.puml](../../../../../docs/uml/creational/singleton.puml).

## 13. Key Takeaway

Singleton is about enforcing one shared instance, not about making every convenient service global.
