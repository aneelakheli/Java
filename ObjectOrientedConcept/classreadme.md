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

In general, class declarations can include these components, in order:

1. Modifiers such as public, private, and a number of others that you will encounter later. (However, note that the private modifier can only be applied to Nested Classes.)
2. The class name, with the initial letter capitalized by convention.
3. The name of the class's parent (superclass), if any, preceded by the keyword extends. A class can only extend (subclass) one parent.
4. A comma-separated list of interfaces implemented by the class, if any, preceded by the keyword implements. A class can implement more than one interface.
5. The class body, surrounded by braces, {}.

In the example, _[MountainBike](MountainBike.java)_ inherits all the fields and methods of _[Bicycle](Bicycle.java)_ and adds the fields _seatHeight_ and a method to set it.

## Declaring Member Variables

There are several kinds of variables:

- Member variables in a class -- these are calleds _fields_
- variables in a method or block of code -- these are called local variables.
- variables in a method declarations -- these are called parameters.

## Access Modifiers

The first (left-most) modifier used lets you control what other classes have access to a member field. For the moment, consider only public and private. Other access modifiers will be discussed later.

public modifier — the field is accessible from all classes.
private modifier — the field is accessible only within its own class.

## Defining Methods

Here is an example of a typical method declaration:

```
    public double addNumber(double numA, double numB){
        //do the add here
    }
```

More generally, method declarations have six components, in order:

1. Modifiers -- such as _public_, _private_, and others you will learn about later.
2. The return type -- the data type of the value returned by the method, or _void_ if the method does not return a value.
3. The method name -- the rules for field names apply to method names as well, but the convention is a little different.
4. The parameters list in parenthesis -- a comma-delimited list of input parameters, preceded by their data types, enclosed by parentheses, {}. if there are no parameters, you must use empty parentheses.
5. An exception list -- []().
6. The method body, enclosed between braces--the method's code, including the declaration of local variables. goes here.

## Overloading Methods

The java supports _overloading_ methods, and java can distinguish between methods with different _method_ signatures. This means that methods within a class can have the same name if they have different parameter list.
overloaded methods are differentiated by the number and the type of the arguments passed into the method.
we cannot declare more than one method with the same name and the same number and types of arguments, because the compiler cannot tell them apart.

### Providing Constructors for Your Classes

A class contains constructors that are invoked to create objects from the class blueprint. Constructor declarations look like method declarations—except that they use the name of the class and have no return type. For example, in an example [Bicycle](Bicycle.java) has one constructor:

```
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }

```

To create a new _Bicycle_ object called _myBike_, a constructor is called by the new operator:

```
    Bicycle myBike = new Bicycle(30, 0, 8);
```

new Bicycle(30, 0, 8) creates space in memory for the object and initializes its fields.
