# Polymorphism

Polymorphism is the ability of an object to take on different forms. In Java, polymorphism refers to the ability of a class to provide different implementations of a method, depending on the type of object that is passed to the method. Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.

Polymorphism is of two different types, i.e., compile-time polymorphism and runtime polymorphism.

One of the examples in **Compile time polymorphism** is that when we overload a static method in java. **Run time polymorphism** is also called a dynamic method dispatch is a method in which a call to an overridden method is resolved at run time rather than compile time. In this method, the overridden method is always called through the reference variable.

**What is Compile -Time Polymorphism in Java?**
Compile-Time polymorphism in java is also known as Static Polymorphism. to resolved at compile-time which is achieved through Method Overloading.

**What is Runtime Polymorphism in Java?**
Runtime polymorphism in java is also known as Dynamic Binding which is used to call to an overridden method that is resolved dynamically at runtime rather than at compile-time. This type of polymorphism is achieved by Method Overriding

By using **method overloading** and **method overriding**, we can perform polymorphism. Generally, the concept of polymorphism is often expressed as one interface, multiple methods. This reduces complexity by allowing the same interface to be used as a general class of action.

## Method Overloading in java

If a class
has multiple methods having same name but different in parameters, it is known as Method Overloading. If we have to perform only one operation, having same name of the methods increases the readability of the program

**Advantage of method overloading**
Method overloading increases the readability of the program.

**Different ways to overload the method**
There are two ways to overload the method in java

1. By changing number of arguments
2. By changing the data type

## Method Overriding in Java

If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.
When a method in a subclass has the same name, same parameters or signature, and same return type(or sub-type) as a method in its super-class, then the method in the subclass is said to override the method in the super-class.
**Method overriding** is one of the way by which java achieve Run Time Polymorphism.The version of a method that is executed will be determined by the object that is used to invoke it. If an object of a parent class is used to invoke the method, then the version in the parent class will be executed, but if an object of the subclass is used to invoke the method, then the version in the child class will be executed.
In other words, it is the type of the object being referred to (not the type of the reference variable) that determines which version of an overridden method will be executed.
