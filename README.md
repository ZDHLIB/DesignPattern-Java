# DesignPattern-Java
Design pattern learning

## SOLID principles
- Single responsibility
    - Do one thing per class.
- Open-closed
    - Open for extension and close for modification.
- Liskov substitution
    - Sub-class can only extend the super class, cannot change the rule or contract of the super class.
- Interface segregation
    - Fine-grained interface is better than fewer bigger interface.
- Dependency injection
    - High-level models should not depend on low-level modules. 
      All modules can depend on structures. 
      Move internal dependencies from components to a framework or structure layer, 
      and let them to inject objects to classes when you need.   
      
## Pattern Classification     
- Creational
    - Abstract Factory
        - Group factories together 
    - Factory 
        - One factory to manage instances' lifecycle
    - Builder
        - Designed for immutable
        - Has inner static class
    - Singleton
        - Often overused
        - Difficult to unit test
        - If not careful, not thread-safe
        - Sometimes confused for Factory
        - java.util.Calendar is not a Singleton, it is Prototype.
    - Prototype
        - Avoid costly creation
        - Avoid subclassing
        - Use clone 
        - Not often used
- Behavioral
    - Visitor
    - Strategy
    - Command
    - Interpreter
    - Mediator
    - Memonto
    - Observer
    - Chain of Responsibility
    - Template 
    - Iterator
- Structural
    - Decorator
    - Composite
    - Adapter
    - Flyweight
    - Facade 
    - Bridge
    - Proxy
