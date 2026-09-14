# Design Patterns Playground

A Java 21 reference and playground for the Gang of Four design patterns. Every pattern is intentionally small, independent, testable, and documented around the problem it solves.

## Project Overview

Each example follows this learning path:

`Problem -> Naive solution -> Design pressure -> Pattern -> Trade-offs`

The core implementation uses plain Java. There is no Spring Boot, database, Docker, Lombok, or multi-module Maven build.

## Goals

- Learn all 23 GoF patterns through focused examples.
- Keep each pattern readable and runnable in isolation.
- Demonstrate behavior with JUnit 5 tests.
- Provide a README and UML diagram for every pattern.

## Technologies

- Java 21
- Maven
- JUnit 5
- PlantUML source diagrams

## Architecture

This is a package-based monolithic learning repository with one Maven module. Pattern packages do not depend on one another.

```text
com.hoangtien.designpatterns
├── creational
├── structural
└── behavioral
```

## Pattern Catalog

### Creational

- [Singleton](src/main/java/com/hoangtien/designpatterns/creational/singleton/README.md)
- [Factory Method](src/main/java/com/hoangtien/designpatterns/creational/factory/README.md)
- [Abstract Factory](src/main/java/com/hoangtien/designpatterns/creational/abstractfactory/README.md) (planned)
- [Builder](src/main/java/com/hoangtien/designpatterns/creational/builder/README.md)
- [Prototype](src/main/java/com/hoangtien/designpatterns/creational/prototype/README.md) (planned)

### Structural

- [Adapter](src/main/java/com/hoangtien/designpatterns/structural/adapter/README.md) (planned)
- [Bridge](src/main/java/com/hoangtien/designpatterns/structural/bridge/README.md) (planned)
- [Composite](src/main/java/com/hoangtien/designpatterns/structural/composite/README.md) (planned)
- [Decorator](src/main/java/com/hoangtien/designpatterns/structural/decorator/README.md) (planned)
- [Facade](src/main/java/com/hoangtien/designpatterns/structural/facade/README.md) (planned)
- [Flyweight](src/main/java/com/hoangtien/designpatterns/structural/flyweight/README.md) (planned)
- [Proxy](src/main/java/com/hoangtien/designpatterns/structural/proxy/README.md) (planned)

### Behavioral

- [Chain of Responsibility](src/main/java/com/hoangtien/designpatterns/behavioral/chainofresponsibility/README.md) (planned)
- [Command](src/main/java/com/hoangtien/designpatterns/behavioral/command/README.md) (planned)
- [Interpreter](src/main/java/com/hoangtien/designpatterns/behavioral/interpreter/README.md) (planned)
- [Iterator](src/main/java/com/hoangtien/designpatterns/behavioral/iterator/README.md) (planned)
- [Mediator](src/main/java/com/hoangtien/designpatterns/behavioral/mediator/README.md) (planned)
- [Memento](src/main/java/com/hoangtien/designpatterns/behavioral/memento/README.md) (planned)
- [Observer](src/main/java/com/hoangtien/designpatterns/behavioral/observer/README.md) (planned)
- [State](src/main/java/com/hoangtien/designpatterns/behavioral/state/README.md) (planned)
- [Strategy](src/main/java/com/hoangtien/designpatterns/behavioral/strategy/README.md)
- [Template Method](src/main/java/com/hoangtien/designpatterns/behavioral/templatemethod/README.md) (planned)
- [Visitor](src/main/java/com/hoangtien/designpatterns/behavioral/visitor/README.md) (planned)

## Folder Structure

```text
docs/
├── overview/
└── uml/
    ├── creational/
    ├── structural/
    └── behavioral/
src/
├── main/java/com/hoangtien/designpatterns/
└── test/java/com/hoangtien/designpatterns/
```

## How to Run

Run a demo with Maven's compiled classes, for example:

```bash
mvn compile
java -cp target/classes com.hoangtien.designpatterns.behavioral.strategy.StrategyDemo
```

## How to Run Tests

```bash
mvn test
```

## Pattern Comparison

| Category | Pattern | Status |
| --- | --- | --- |
| Creational | Singleton | Done |
| Creational | Factory Method | Done |
| Creational | Builder | Done |
| Behavioral | Strategy | Done |
| Remaining GoF patterns | See catalog above | Planned |

## Learning Roadmap

1. Phase 1: Singleton, Factory Method, Builder, Adapter, Decorator, Facade, Strategy, Observer, State, Command.
2. Review package boundaries, documentation consistency, and test style.
3. Phase 2: Abstract Factory, Prototype, Bridge, Composite, Proxy, Chain of Responsibility, Template Method, Iterator, Mediator, Memento.
4. Phase 3: Flyweight, Interpreter, Visitor.

## Development Philosophy

A pattern is useful only when it explains a real design pressure. Every example should make clear why the pattern exists, what the simpler alternative costs, and which trade-offs the pattern introduces.
