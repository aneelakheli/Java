## Java inner Class

Java inner class or nested class is a class that is declared inside the class or interface We use inner classes to logically group classes and interfaces in one place to be more readable and maintainable. Additionally, it can access all the members of the outer class, including private data members and methods.

**Syntax of Inner class**
``` java
class Java_Outer_class{  
 //code  
 class Java_Inner_class{  
  //code  
 }  
}  
```
An instance of InnerClass can exist only within an instance of OuterClass and has direct access to the methods and fields of its enclosing instance.

To instantiate an inner class, you must first instantiate the outer class. Then, create the inner object within the outer object with this syntax:
```java
    OuterClass outerObject = new OuterClass();
    OuterClass.InnerClass innerObject = outerObject.new InnerClass();
```
There are two special kinds of inner classes: _local classes_ and _anonymous classes_.

**Advantage of Java inner classes**
There are three advantages of inner classes in Java. They are as follows:
1. Nested classes represent a particular type of relationship that is it can access all the members (data members and methods) of the outer class, including private.
2. Nested classes are used to develop more readable and maintainable code because it logically group classes and interfaces in one place only.
3. Code Optimization: It requires less code to write.

**Need of Java Inner class**

Sometimes users need to program a class in such a way so that no other class can access it. Therefore, it would be better if you include it within other classes.

If all the class objects are a part of the outer object then it is easier to nest that class inside the outer class. That way all the outer class can access all the objects of the inner class.

## Nested Classes

Nested classes are divided into two categories: _non-static_ and _static_. Non-static nested classes are called inner classes. Nested classes that are declared static are called static nested classes.

## Shadowing

If a declaration of a type (such as a member variable or a parameter name) in a particular scope(such as an inner class or a method definition) has the same name as another declaration in the enclosing scope, then the declaration shadows the declaration of the enclosing scope. You cannot refers to a shadowed declaration by its name alone. 

## Local Classes
Local classes are classes that are defined in a block, which is a group of zero or more statements between balanced braces. we typically find local classes defined in the body of a method

**Declaring Local Classes**
we can define a local class inside any block. for example, we can define a local class in a method body, a _for_ loop, or an _if_ clause.