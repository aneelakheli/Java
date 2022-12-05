## Generics

Generics means _parameterized_ types. Parameterized types are important because they enables us to create classes, interfaces, and methods in which the type of data upon which they operate is specified as a parameters. using generics, it is possible to create a single class, for example, that automatically works with different types of data. A class, interface, or method that operates on a parameterized type is called _generics_ as in _generic class_ or _generic method_.

## Why Generics

The **Object** is the superclass of all other classes, and Object reference can refer to any object. These features lack type safety. Generics add that types of safety feature.

## Types of Java Generics

**Generics Method:** Generics java method takes a parameters and returns some value after performing a task. it is exactly like a normal function, however, a generic method has type parameters that are cited by actual type. This allow the generic method to be used in a more general way. The compiler take care of the type of safety which enables programmers to code easily since they do not have to perform long, individual type castings.

**Generics Class:** A generics class is implemented exactly like a non-generic class. The only difference is that it contains a type parameter section. There can be more than one type of parameter, separated by a comma. The classes, which accept one or more parameters, are known as parameterized classes or parameterized types.

**_Note: In parameter type we can not use primitives like 'int', 'char' or 'double'._**
