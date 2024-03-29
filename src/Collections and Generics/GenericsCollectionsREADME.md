## Generics

Generics means _parameterized_ types. Parameterized types are important because they enables us to create classes, interfaces, and methods in which the type of data upon which they operate is specified as a parameters. using generics, it is possible to create a single class, for example, that automatically works with different types of data. A class, interface, or method that operates on a parameterized type is called _generics_ as in _generic class_ or _generic method_.

## Why Generics

The **Object** is the superclass of all other classes, and Object reference can refer to any object. These features lack type safety. Generics add that types of safety feature.

## Types of Java Generics

**Generics Method:** Generics java method takes a parameters and returns some value after performing a task. it is exactly like a normal function, however, a generic method has type parameters that are cited by actual type. This allow the generic method to be used in a more general way. The compiler take care of the type of safety which enables programmers to code easily since they do not have to perform long, individual type castings.Following are the rules to define Generics Methods:

- All generic method declarations have a type parameter section delimited by angle brackets (< and >) that precedes the method's return type ( < E > in the next example).
- Each type parameter section contains one or more type parameters separated by commas. A type parameter, also known as a type variable, is an identifier that specifies a generic type name.
- The type parameters can be used to declare the return type and act as placeholders for the types of the arguments passed to the generic method, which are known as actual type arguments.
- A generic method's body is declared like that of any other method. Note that type parameters can represent only reference types, not primitive types (like int, double and char).

**Generics Class:** A generics class is implemented exactly like a non-generic class. The only difference is that it contains a type parameter section. There can be more than one type of parameter, separated by a comma. The classes, which accept one or more parameters, are known as parameterized classes or parameterized types.

**Note: In parameter type we can not use primitives like '_int_', '_char_' or '_double_'.**

**Generics Works only with Reference Types**

When we declare an instance of a generic type, the type argument passed to the type parameter must be a reference type. We _cannot_ use **primitive data types** like **int**, **char**.

```java
Test<int> obj = new Test<int>(20);
```

The above line results in a compile-time error that can be resolved using type _wrappers_ to encapsulate a primitive type.

But primitive type arrays can be passed to the type parameter because arrays are reference types.

```java
ArrayList<int[]> a = new ArrayList<>();
```

**Type Parameters in Java Generics:**
By convention, type parameter names are single, uppercase letters. The type parameters naming conventions are important to learn generics thoroughly. The common type parameters are as follows:

```
- E – Element (used extensively by the Java Collections Framework)
- T – Type
- K – Key
- N – Number
- V – Value
- S,U,V etc. - 2nd, 3rd, 4th types

__Type Parameter and Type Argument Terminology__: Many developers use the terms "type parameter" and "type argument" interchangeably, but these terms are not the same. When coding, one provides type arguments in order to create a parameterized type. Therefore, the T in Foo<T> is a type parameter and the String in Foo<String> f is a type argument. This lesson observes this definition when using these terms.
```

### Advantages of Generics:

Programs that use Generics has got many benefits over non-generic code.

- **Code Reuse**: We can write a method/class/interface once and use it for any type we want.
- **Type Safety**: Generics make errors to appear compile time than at run time (It’s always better to know problems in your code at compile time rather than making your code fail at run time). Suppose you want to create an ArrayList that store name of students, and if by mistake the programmer adds an integer object instead of a string, the compiler allows it. But, when we retrieve this data from ArrayList, it causes problems at runtime.

# Collection in Java

A **Collection** represents a single unit of objects, i.e., a group.

The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects. Java Collections can achieve all the operations that you perform on a data such as searching, sorting, insertion, manipulation, and deletion. Java Collection framework provides many interfaces (Set, List, Queue, Deque) and classes (ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet).

Framework in Java:

- It provides readymade architecture.
- It represent a set of classes and interfaces.
- It is optional.

Collection id a framework that represents a unified architecture for storing and manipulating a group of objects. It has:

1. **Interfaces:**
   Interfaces are abstract data types that represent collections. They allow collections to be manipulated independently of the details of their representation. In object-oriented languages, interfaces generally form a hierarchy.
2. **Implementation:**These are the concrete implementations of the collection interfaces. In essence, they are reusable data structures.
3. **Algorithms:**These are the methods that perform useful computations, such as searching and sorting, on objects that implement collection interfaces. The algorithms are said to be polymorphic: that is, the same method can be used on many different implementations of the appropriate collection interface. In essence, algorithms are reusable functionality.

## Hierarchy of Collection Framework.

Hierarchy of Collection framework. The **java.util** package contains all the classes and interfaces for the Collection framework.

![Collection framworks](/src/Images/collectionframework.jpg " Hierarchy of Collection framework.")

## ArrayList:

The **ArrayList** class implements the _List_ interface. It uses a dynamic array to store the duplicate element of different data types. The ArrayList class maintains the insertion order and is non-synchronized. The elements stored in the ArrayList class can be randomly accessed.

## LinkedList:

LinkedList implements the Collection interface. It uses a doubly linked list internally to store the elements. It can store the duplicate elements. It maintains the insertion order and is not synchronized. In LinkedList, the manipulation is fast because no shifting is required.

## Vector:

Vector uses a dynamic array to store the data elements. It is similar to ArrayList. However, It is synchronized and contains many methods that are not the part of Collection framework.

## TreeSet:

TreeSet class implements the Set interface that uses a tree for storage. It inherits AbstractSet class and implements the NavigableSet interface. The objects of the TreeSet class are stored in ascending order.

The important points about the Java TreeSet class are:

Java TreeSet class contains unique elements only like HashSet.

> Java TreeSet class access and retrieval times are quiet fast.
> Java TreeSet class doesn't allow null element.
> Java TreeSet class is non synchronized.
> Java TreeSet class maintains ascending order.
> Java TreeSet class contains unique elements only like HashSet.
> Java TreeSet class access and retrieval times are quite fast.
> Java TreeSet class doesn't allow null elements.
> Java TreeSet class is non-synchronized.
> Java TreeSet class maintains ascending order.
> The TreeSet can only allow those generic types that are comparable. For example The Comparable interface is being implemented by the StringBuffer class.
