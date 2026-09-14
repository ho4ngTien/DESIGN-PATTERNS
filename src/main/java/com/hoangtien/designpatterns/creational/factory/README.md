# Factory Method Pattern

## 1. Problem

A notification workflow needs to send email, SMS, or push messages. If the workflow constructs concrete classes directly, adding a channel changes the workflow itself.

## 2. Without Factory Method

A client grows a conditional such as `if (type == EMAIL) new EmailNotification()`. Creation logic and notification workflow become tightly coupled.

## 3. Solution

Factory Method moves object creation into subclasses while the base creator keeps the common workflow.

## 4. Structure

- `Notification`: product interface.
- `EmailNotification`, `SmsNotification`, `PushNotification`: concrete products.
- `NotificationFactory`: creator with the factory method and common operation.
- Concrete factories: choose the product to create.

## 5. Implementation

`notify` delegates creation to `createNotification`, so the workflow does not know the concrete notification class.

## 6. Example

Run `FactoryMethodDemo`. Swap `EmailNotificationFactory` for another factory without changing the notification workflow.

## 7. When to Use

Use it when subclasses or configuration decide which product is needed and the creation step varies independently from the workflow.

## 8. When NOT to Use

Do not introduce a factory hierarchy for one stable product or a trivial constructor.

## 9. Advantages

- Keeps clients independent from concrete products.
- Localizes creation decisions.
- Makes new product types easy to add.

## 10. Disadvantages

- Adds creator subclasses.
- The class hierarchy can be larger than a simple direct construction.

## 11. Related Patterns

Abstract Factory creates families of related products. Builder separates construction steps from the final product.

## 12. UML

See [factory-method.puml](../../../../../docs/uml/creational/factory-method.puml).

## 13. Key Takeaway

Factory Method varies object creation through polymorphism while keeping the consuming algorithm stable.
