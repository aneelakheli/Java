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

**Note**: If another class cannot call a MyClass constructor, it cannot directly create MyClass objects.

# Passing parameters to a method and constructor

The declaration for a method or a constructor declares the number and the type of the arguments for that _method_ or _constructor_. For example, the following is a method that computes the monthly payments for a home loan, based on the amount of the loan, the interest rate, the length of the loan (the number of periods), and the future value of the loan:

```Java
    public double computePayment(double loanAmt, double rate, double futureValue,int numPeriods) {
        double interest = rate / 100.0;
        double partial1 = Math.pow((1 + interest),- numPeriods);
        double denominator = (1 - partial1) / interest;
        double answer = (-loanAmt / denominator)
                        - ((futureValue * partial1) / denominator);
        return answer;
    }
```

This method has four parameters: the loan amount, the interest rate, the future value and the number of periods. The first three are double-precision floating point numbers, and the fourth is an integer. The parameters are used in the method body and at runtime will take on the values of the arguments that are passed in.

---

Note: Parameters refers to the list of variables in a method declaration. Arguments are the actual values that are passed in when the method is invoked. When you invoke a method, the arguments used must match the declaration's parameters in type and order.

---

## Parameter Types

You can use any data type for a parameter of a method or a constructor. This includes primitive data types, such as doubles, floats, and integers, as you saw in the computePayment method, and reference data types, such as objects and arrays.

```java
    public Polygon polygonFrom(Point[] corners) {
    // method body goes here
}
```
