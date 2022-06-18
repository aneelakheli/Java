# Object Class in Java

### **Object Class in Java**

The Object class is the parent class of all the classes in java by default. in other words, it is the topmost class of java.
The object class is benificial if you want to refer any object whose type you don't know. Notice that parent class reference variable can refer the child class object, known as upcasting.

let's take an example, there is getObject() method that returns an object but it can be any type like Employee, Student etc, we can use Object class reference to refer that object. For Example:

```java
    Object obj = getObject(); //we don't know what object will be returned from this method.

```

The Object class provides some common behaviors to all the objects such as object can be compared, object can be cloned, object can be notified etc.

## Object Cloning in Java

The **Object Cloning** is a way to create exact copy of an object. The clone() method of object class is used to clone an object.
The **java.lang.Cloneable** interface must be implemented by the class whose object clone we want to create. if we don't implement cloneable interface, clone() method generates **CloneNotSupportedException**

## Wapper Classes in Java

The wrapper class in Java provides the mechanism to convert primitive into object and object into primitive.

Since J2SE 5.0, autoboxing and unboxing feature convert primitives into objects and objects into primitives automatically. The automatic conversion of primitive into an object is known as autoboxing and vice-versa unboxing.

### Use of Wrapper classes in Java

Java is an object-oriented programming language, so we need to deal with objects many times like in Collections, Serialization, Synchronization, etc. Let us see the different scenarios, where we need to use the wrapper classes.

- **Change the value in Method:** Java supports only call by value. So, if we pass a primitive value, it will not change the original value. But, if we convert the primitive value in an object, it will change the original value.
- **Serialization:** We need to convert the objects into streams to perform the serialization. If we have a primitive value, we can convert it in objects through the wrapper classes.
- **Synchronization:** Java synchronization works with objects in Multithreading.
- **java.util package:** The java.util package provides the utility classes to deal with objects.
- **Collection Framework:** Java collection framework works with objects only. All classes of the collection framework (ArrayList, LinkedList, Vector, HashSet, LinkedHashSet, TreeSet, PriorityQueue, ArrayDeque, etc.) deal with objects only.

**Autoboxing**
The automatic conversion of primitive data type into its corresponding wrapper class is known as autoboxing, for example, byte to Byte, char to Character, int to Integer, long to Long, float to Float, boolean to Boolean, double to Double, and short to Short.

Since Java 5, we do not need to use the valueOf() method of wrapper classes to convert the primitive into objects.

**Unboxing**
The automatic conversion of wrapper type into its corresponding primitive type is known as unboxing. It is the reverse process of autoboxing.
Since Java 5, we do not need to use the intValue() method of wrapper classes to convert the wrapper type into primitives

### Recursion

Recursion in java is a process in which a method calls itself continuously. A method in java that calls itself is called recursive method.
It makes the code compact but complex to understand.

Syntax:

```
returntype methodname(){
//code to be executed
methodname();//calling same method
}
```

## Call by value and Call by Reference

There is only call by value in java, not call by Reference. if we call a method passing a value, it is known as call by value. The changes being done in the called method, is not affected in the calling method.

In case of call by reference original value is changed if we made changes in the called method. if we pass object in place of any primitive value, original value will be changed.

Java uses only call by value while passing reference variables as well. It creates a copy of references and passes them as valuable to the methods. As reference points to same address of object, creating a copy of reference is of no harm. But if new object is assigned to reference it will not be reflected.
