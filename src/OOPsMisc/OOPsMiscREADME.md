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
