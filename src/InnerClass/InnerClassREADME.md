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


## Anonymous Classes

Anonymous classes enable you to make our code more concise. They enable our classes to declare and instantiate a class at the same time. They are like local classes except that they do not have a name. Use them if we need to use a local class only once.

The anonymous class expression consists of the following:

1. The __new__ operator
2. The name of an interface to implement or a class to extend. In [this](./HelloWorldAnonymousClass.java) example, the anonymous class is implementing the _interface_ HelloWorld.
3. Parentheses that contain the arguments to a constructor, just like a normal class instance creation expression. **Note:** When implement an interface, there is no constructor, so use an empty pair of parentheses, as in this example.
4. A body, which is a class declaration body. More specifically, in the body, method declarations are allowed but statements are not.

Because an anonymous class definition is an expression, it must be part of a statement. In this example, the anonymous class expression is part of the statement that instantiates the frenchGreeting object. (This explains why there is a semicolon after the closing brace.)

**Accessing Local Variables of the Enclosing Scope, and Declaring and Accessing Members of the Anonymous Class**

Like local classes, anonymous classes can capture variables; they have the same access to local variables of the enclosing scope:

- An anonymous class has access to the members of its enclosing class.
- An anonymous class cannot access local variables in its enclosing scope that are not declared as final or effectively final.
- Like a nested class, a declaration of a type (such as a variable) in an anonymous class shadows any other declarations in the enclosing scope that have the same name. See Shadowing for more information.
Anonymous classes also have the same restrictions as local classes with respect to their members:
- You cannot declare static initializers or member interfaces in an anonymous class.
- An anonymous class can have static members provided that they are constant variables.

Note that you can declare the following in anonymous classes:

- Fields
- Extra methods (even if they do not implement any methods of the supertype)
- Instance initializers
- Local classes
- However, you cannot declare constructors in an anonymous class.

## Lambda Expression
One isssues with anonymous classes is that if the implementation of our anonymous class is very simple, such as an interface that contains only one method, then the syntax of anonymous classes may seem unwidely and unclear. in these cases, we're usually trying to pass functionality as an argument to another method, such as what action should be taken when someone clicks a button. lambda empressions enable our code to do this, to treat functionality as method argument, or code as data.
Anonymous class, shows how to implement a base class without giving it a name. Although this is often more concise than a named classes with only one method, even an anonymous class seems a bit excessive and cubersome. Lambda expressions let you express instances of single-method classes more compactly. 
**Lambda expression** is a short block of code which takes in parameters and returns a value. Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.

**Syntax:**
The simplest lambda expression contains a single parameters and an expression:
```
    parameter -> expression
```
To use more than one parameter, wrap them in parentheses:
__Syntax:__
```
    (parameter1, parameter2) -> expression
```
expressions are limited. They have to immediately return a value, and they cannot contain variables, assignments or statements such as __if__ or __for__. in order to do more complex operations, a code block can be used with curly braces. if the lambda expression needs to return a value, then the code block should have a __return__ statements.
__Syntax:__
```
    (parameter1, parameter2)->{ code block }
```

## Method References
We use Lambda Expression to create anonymous methods. Sometimes, however, a lambda expression does nothing but call an existing method. in those cases, it's often clearer to refer to the existing method by name. Method references enables us to do this, they are compact, easy-to-read lambda expressions for methods that already have a name.

### Kinds of Method References
There are four kinds of method references:

1. **Reference to a static method**
  Syntax: 
```java
       ContainingClass :: staticMethodName
       Person::compareByAge
       MethodReferenceExamples::appendStrings
 ```
2. **Reference to an instance method of a particular object**
Syntax
```Java
    ContainingObject:: instanceMethodName
    myComparisonProvider::compareByName
    myApp:: appendStrings2
```
3. **Reference to an instance method of an arbitrary object of a particular type**
Syntax:
```
    ContainingType::methodName	
    String::compareToIgnoreCase
    String::concat

```
4. **Reference to a constructor**
```java
	ClassName::new
    HashSet::new
```