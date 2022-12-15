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
