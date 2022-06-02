## Java Static Keyword

The _static_ keyword in java is used for memory management mainly. we can apply static keyword with variables, methods, blocks and nested classes. The static keyword belongs to the class than an instance of the class. The static keyword is used for a constant variable or a method that is the same for every instance of a class.
The static can be:

1. Variable( also known as class variable) example [static variable](StaticVariable.java)
2. Method (also known as class method) example [static method](StaticMethodEx.java)
3. Block
4. Nested class [static class](StaticClassEx.java)

### Java static variable

If you declare any variable as static, it is known as a static variable. The static variable can be used to refer to the common property of all objects (which is not unique for each object), for example, the company name of employees, college name of students, etc.
The static variable gets memory only once in the class area at the time of class loading.

**Advantages of static variable**

- It makes your program **memory efficient** (i.e., it saves memory).

Note: To create static member(block, variable, method nested class), precede its declaration with the keyword static.

java static property is shared to all objects.

**When to used static variable and method?**
Use the static variable for the property that is common to all objects.

**Static Classes**

A Class can be made **static** only if it is a nested class. We cannot declare a top-level class with a static modifier but can declare nested classes as static. Such types of classes are called Nested static classes..
Nested static class doesn't need a reference of outer class.
