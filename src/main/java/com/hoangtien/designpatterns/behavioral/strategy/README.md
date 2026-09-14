# Strategy Pattern

## 1. Problem

Checkout can calculate totals using normal, student, or VIP discount rules. The rules change independently from the checkout flow.

## 2. Without Strategy

A single checkout method accumulates conditionals for every customer type. Each new promotion increases the risk of changing unrelated rules.

## 3. Solution

Strategy extracts each discount algorithm behind one interface. The context delegates the calculation to the selected strategy.

## 4. Structure

- `CheckoutService`: context that uses a discount strategy.
- `DiscountStrategy`: strategy interface.
- `StudentDiscountStrategy`, `VipDiscountStrategy`, `NoDiscountStrategy`: concrete strategies.

## 5. Implementation

The strategy is injected into the context, so the checkout flow does not contain discount-specific conditionals. A caller can choose another algorithm without changing `CheckoutService`.

## 6. Example

Run `StrategyDemo`, then replace `StudentDiscountStrategy` with `VipDiscountStrategy` or `NoDiscountStrategy`.

## 7. When to Use

Use it when several algorithms solve the same operation and callers need to select or replace the algorithm.

## 8. When NOT to Use

Do not create strategies for behavior that never varies or for a single trivial branch.

## 9. Advantages

- Removes algorithm conditionals from the context.
- Makes each rule independently testable.
- Supports runtime substitution.

## 10. Disadvantages

- Adds more small classes.
- Callers must understand which strategy to choose.

## 11. Related Patterns

State changes behavior based on internal state transitions. Template Method fixes an algorithm skeleton and varies selected steps through inheritance.

## 12. UML

See [strategy.puml](../../../../../docs/uml/behavioral/strategy.puml).

## 13. Key Takeaway

Strategy lets an object vary an algorithm without changing the object that coordinates the operation.
