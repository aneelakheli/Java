# Array in Java

An array in Java is a group of like-typed variables referred to by a common name. Arrays in Java work differently than they do in C/C++. Following are some important points about Java arrays.

- In Java, all arrays are dynamically allocated.
- Since arrays are objects in Java, we can find their length using the object property length. This is different from C/C++, where we find length using sizeof.
- A Java array variable can also be declared like other variables with [] after the data type.
- The variables in the array are ordered, and each has an index beginning from 0.
- Java array can also be used as a static field, a local variable, or a method parameter.
- The size of an array must be specified by int or short value and not long.
- The direct superclass of an array type is Object.
- Every array type implements the interfaces **Cloneable** and java.io.Serializable.

An array can contain primitives (int, char, etc.) and object (or non-primitive) references of a class depending on the definition of the array. In the case of primitive data types, the actual values are stored in contiguous memory locations. In the case of class objects, the actual objects are stored in a heap segment.

## Creating, initializing and accessing an Array

                    **One-Dimensional Arrays:**

The general form of a one-dimensional array declaration is

```
    type var-name[];
      OR
    type[] var-name;
```

An array declaration has two components: the type and the name. type declares the element type of the array. The element type determines the data type of each element that comprises the array. Like an array of integers, we can also create an array of other primitive data types like char, float, double, etc., or user-defined data types (objects of a class). Thus, the element type for the array determines what type of data the array will hold.

```java
    int intArray[];
    or int[] intArray;

    // an array of references to objects of
    // the class MyClass (a class created by
    // user)
    MyClass myClassArray[];

    Object[]  ao,        // array of Object
    Collection[] ca;      // array of Collection  of unknown type

```

### Instantiating an Array in Java

When an array is declared, only a reference of an array is created. To create or give memory to the array, you create an array like this: The general form of new as it applies to one-dimensional arrays appears as follows:

**Example:**

```
    int intArray[];  //declaring array
    intArray= new int[20]; //allocating memory to array
    OR
    int[] intArray = new int[20]; // combining both statements in one

```

**NOTE**

1. The elements in the array allocated by new will automatically be initialized to zero (for numeric types), false (for boolean), or null (for reference types).
2. Obtaining an array is a two-step process. First, we must declare a variable of the desired array type. Second, we must allocate the memory to hold the array, using new, and assign it to the array variable. Thus, in Java, all arrays are dynamically allocated.

### Array literal

In a situation where the size of the array and variables of the array are already known, array literals can be used.

```java
    int[] intArray = new int[]{1,2,3,4,5,6,7,8,9}; //Declaring array literal.
```

- The length of this array determines the length of the created array.
- There is no need to write the new int[] part in the latest versions of java.
