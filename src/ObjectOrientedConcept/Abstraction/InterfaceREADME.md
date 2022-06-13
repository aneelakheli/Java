# Interface in Java

An **Interface** in Java programming language is defined as an abstract type used to specify the behavior of a class. An interface in Java is a blueprint of a class. A Java interface contains static constants and abstract methods.

The **interface** in Java is a mechanism to achieve abstraction. There can be only abstract methods in the Java interface, not the method body. It is used to achieve [abstraction](AbstractReadMe.md) and multiple [inheritance](../Inheritance/InheritanceReadMe.md) in Java. In other words, you can say that interfaces can have abstract methods and variables. It cannot have a method body. Java Interface also represents the **IS-A relationship**.

Like a class, an interface can have methods and variables, but the methods declared in an interface are by default abstract (only method signature, no body).

1. Interfaces specify what a class must do and not how. It is the blueprint of the class.
2. An Interface is about capabilities like a Player may be an interface and any class implementing Player must be able to (or must implement) move(). So it specifies a set of methods that the class has to implement.
3. If a class implements an interface and does not provide method bodies for all functions specified in the interface, then the class must be declared abstract.
4. A Java library example is Comparator Interface. If a class implements this interface, then it can be used to sort a collection.

**Syntax**

```java
    interface {
        //declare constant fields
        // declare methods that abstract by default
    }
```

To declare an interface, use the **interface** keyword. It is used to provide total abstraction. That means all the methods in an interface are declared with an empty body and are public and all fields are **public, static, and final by default. A class that implements an interface must implement all the methods declared in the interface**. **To implement interface use implements keyword**.

## Why do we use an Interface?

1. It is used to achieve total abstraction.
2. Since java does not support multiple inheritances in the case of class, by using an interface it can achieve multiple inheritances.
3. It is also used to achieve loose coupling.
4. Interfaces are used to implement abstraction. So the question arises why use interfaces when we have abstract classes?
