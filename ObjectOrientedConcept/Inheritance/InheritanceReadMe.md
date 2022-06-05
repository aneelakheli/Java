# Inheritance in java

Inheritance is an important pillar of OOP(Object-Oriented Programming). It is the mechanism in java by which one class is allowed to inherited the features(fields and methods) of another class.

#### Important terminology:

- **Super class**: The class whose features are inherited is known as superclass(or a base class or a parent class).
- **Sub Class**: The class that inherits the other class is known as a subclass(or a derived class, extended class, or child class). The subclass can add its own fields and methods in addition to the superclass fields and methods.
- **Reusability**: Inheritance supports the concept of _reusability_, i.e, when we want to create a new class and there is already a class that includes some of the code that we want, we can derive our new class from the existing class. By doing this, we are reusing the fields and methods of the existing class.

#### How to use inheritance in java

The keyword used for inheritance is **_extends_**.

#### Why use inheritance in java.

- For Method Overriding( so runtime polymorphism can be achieved).
- For Code Reusability.

**Syntax**

```java
    Class Subclass extends Superclass-name
    {
        //methods and fields
    }
```

The **extends** keyword indicates that you are making a new class that derives from an existing class. The meaning of **extends** is to increase the functionality.

`` **NOTE**: Multiple inheritance is not supported in java through class.
