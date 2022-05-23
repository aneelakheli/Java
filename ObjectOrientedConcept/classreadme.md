# Class

**What is Class**
A class is a group of objects which have common properties. it is a templates or blueprints from which object are created . it is logical entity. it can't be physical.
A class in java can contain:

- Fields
- Methods
- Constructor
- Blocks
- Nested Class and Interface

A _class_ is declared by use of the **class** keyword. The class that have been used up to this point are actually very limited examples of its complete form. classes can get much more complex.

A simplified general forms of a class definition is shown here:

#### Declaring classes

```
   class classname{
       type instance-variable1;
       type instance-variable2;
       //...
       type instance-variableN;

       type methodName1(parameter-list){
           //body of method
       }
       type methodName2(parameter-list){
           //body of method
       }
       //..
       type methodNameN(parameter-list){
           //body of method
       }
   }
```

This is class declaration. The class body(area between braces) contains all the code that provides for the life cycle of object created from the class: constructor for initializing new objects, declarations for the fields that provides the state of the class and it's objects, and methods to implements the behaviors of the class and it's objects.

The preceding class declaration is a minimal one. It contains only those components of a class declaration that are required. You can provide more information about the class, such as the name of its superclass, whether it implements any interfaces, and so on, at the start of the class declaration. For example,

```
    class MyClass extends MySuperClass implements YourInterface {
    // field, constructor, and
    // method declarations
    }
```

The example class [Bicycle](Bicycle.java)

means that MyClass is a subclass of MySuperClass and that it implements the YourInterface interface.

---

In general, class declarations can include these components, in order:

1. Modifiers such as public, private, and a number of others that you will encounter later. (However, note that the private modifier can only be applied to Nested Classes.)
2. The class name, with the initial letter capitalized by convention.
3. The name of the class's parent (superclass), if any, preceded by the keyword extends. A class can only extend (subclass) one parent.
4. A comma-separated list of interfaces implemented by the class, if any, preceded by the keyword implements. A class can implement more than one interface.
5. The class body, surrounded by braces, {}.
