## Object

Object are created in java for invoking the methods. Through these object interactions, a program can carry out various tasks, such as implementing a GUI, running an animation, or sending and receiving information over a network. Once an object has completed the work for which it was created, its resources are recycled for use by other objects.

## Creating Objects

As you know, a class provides the blueprint for objects; you create an object from a class. Each of the following statements taken from the below program creates an object an and assigns it to a variable:

```java
        Point originOne = new Point(23, 94);
        Rectangle rectOne = new Rectangle(originOne, 100, 200);
        Rectangle rectTwo = new Rectangle(50, 100);
```

The first line creates an _object_ of the Point class, and the second and third lines each create an _object_ of the Rectangle class.

Each of these statements has three parts (discussed in detail below):

1. **Declaration**: The code set in bold are all variable declarations that associate a variable name with an object type.
2. **Instantiation**: The new keyword is a Java operator that creates the object.
3. **Initialization**: The new operator is followed by a call to a constructor, which initializes the new object.

**3 Ways to initialize object**
There are 3 ways to initialize object in Java.

1. By reference variable
2. By method
3. By constructor

Here's a small program, called CreateObjectDemo, that creates three objects: one Point object and two Rectangle objects. You will need all three source files to compile this program.

```java
public class CreateObjectDemo {

    public static void main(String[] args) {

        // Declare and create a point object and two rectangle objects.
        Point originOne = new Point(23, 94);
        Rectangle rectOne = new Rectangle(originOne, 100, 200);
        Rectangle rectTwo = new Rectangle(50, 100);

        // display rectOne's width, height, and area
        System.out.println("Width of rectOne: " + rectOne.width);
        System.out.println("Height of rectOne: " + rectOne.height);
        System.out.println("Area of rectOne: " + rectOne.getArea());

        // set rectTwo's position
        rectTwo.origin = originOne;

        // display rectTwo's position
        System.out.println("X Position of rectTwo: " + rectTwo.origin.x);
        System.out.println("Y Position of rectTwo: " + rectTwo.origin.y);

        // move rectTwo and display its new position
        rectTwo.move(40, 72);
        System.out.println("X Position of rectTwo: " + rectTwo.origin.x);
        System.out.println("Y Position of rectTwo: " + rectTwo.origin.y);
    }
}
```

This program creates, manipulates, and displays information about various objects. Here's the output:

```
    Width of rectOne: 100
    Height of rectOne: 200
    Area of rectOne: 20000
    X Position of rectTwo: 23
    Y Position of rectTwo: 94
    X Position of rectTwo: 40
    Y Position of rectTwo: 72
```

The following three sections use the above example to describe the life cycle of an object within a program. From them, you will learn how to write code that creates and uses objects in your own programs. You will also learn how the system cleans up after an object when its life has ended.

# Constructors in java

In Java, a **constructor** is a block of codes similar to the method. It is called when an instance of the class is created. At the time of calling constructor, memory for the object is allocated in the memory. It is a special type of method which is used to initialize the object. Every time an object is created using the _new()_ keyword, at least one constructor is called.

It calls a default constructor if there is no constructor available in the class. In such case, Java compiler provides a default constructor by default. There are two types of constructors in java: _no-arg_ constructor, and _parameterized_ constructor.

## Rules for creating java constructor:

There are two rules defined for the constructor:

1. Constructor name must be the same as its class name.
2. A Constructor must hava no explicit return type.
3. A java constructor cannot be _abstract_, _static_, _final_, and _synchronized_

## Constructor Overloading in Java

In java, a constructor is just like a method but without return type. It can also be overloaded
