# Exception In Java

**_Exception_** is an abnormal condition.
An exception (or exceptional event) is a problem that arises during the execution of a program. When an Exception occurs the normal flow of the program is disrupted and the program/Application terminates abnormally, which is not recommended, therefore, these exceptions are to be handled.

## Types of Java Exceptions

There are mainly two types of exceptions: **checked** and **unchecked**. An error is considered as the unchecked exception. However, according to Oracle, there are three types of exceptions namely:

1. **Checked Exception:**
   The classes that directly inherit the Throwable class except RuntimeException and Error are known as checked exceptions. For example, IOException, SQLException, etc. Checked exceptions are checked at compile-time.

2. **Unchecked Exception:**
   The classes that inherit the RuntimeException are known as unchecked exceptions. For example, ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, etc.
   These exceptions are not checked at compile-time but run-time. Some of the common runtime exceptions are:
   Improper use of an API - IllegalArgumentException
   Null pointer access (missing the initialization of a variable) - NullPointerException
   Out-of-bounds array access - ArrayIndexOutOfBoundsException
   Dividing a number by 0 - ArithmeticException
   You can think about it in this way. “If it is a runtime exception, it is your fault”.

   The NullPointerException would not have occurred if you had checked whether the variable was initialized or not before using it.

   An ArrayIndexOutOfBoundsException would not have occurred if you tested the array index against the array bounds.

3. **Error:**
   Error is irrecoverable. Some example of errors are OutOfMemoryError, VirtualMachineError, AssertionError etc.

## Advantage of Exception Handling

The core advantage of exception handling is to maintain the **normal flow** of the application. An exception normally disrupts the normal flow of the application; that is why we need to handle exceptions.

## Catching Exceptions

A method catches an exception using a combination of the **try** and **catch** keywords. A try/catch block is placed around the code that might generate an exception. Code within a try/catch block is referred to as protected code, and the syntax for using try/catch looks like the following −

Syntax:

```java
   try{
   //Protected code
   }catch(Exception e){
   //catch block
   }

```

Here, we have placed the code that might generate an exception inside the try block. Every try block is followed by a catch block.
When an exception occurs, it is caught by the catch block. The catch block cannot be used without the try block.

## **Finally** block

In Java, the finally block is always executed no matter whether there is an exception or not.
The finally block is optional. And, for each try block, there can be only one finally block.
The basic syntax of finally block is:

**Important of finally Block**

- **Finally** block in Java can be used to put "cleanup" code such as closing a file, closing connection, etc.
- The important statements to be printed can be placed in the finally block.

syntax:

```java
try {
//code
}
catch (ExceptionType1 e1) {
// catch block
}
finally {
// finally block always executes
}
```

## Java Multiple-Catch block

A try block can be followed by one or more catch blocks. Each catch block must contain a different exception handler. So, if you have to perform different tasks at the occurrence of different exceptions, use java multi-catch block.

**Point To Remember**

- At a time only one exception occurs and at a time only one catch block is executed.
- All catch blocks must be ordered from most specific to most general, i.e. catch for _ArithmeticException_ must come before catch for Exception.

## Java Nested Try Block

In Java, using a try block inside another try block is permitted. It is called as nested try block. Every statement that we enter a statement in try block, context of that exception is pushed onto the stack. For example, the inner try block can be used to handle ArrayIndexOutOfBoundsException while the outer try block can handle the ArithemeticException (division by zero).

**Important of Nested Try block**
Sometimes a situation may arise where a part of a block may cause one error and the entire block itself may cause another error. In such cases, exception handlers have to be nested.

syntax:

```java
try{
   statement-1;
   statement-2;
   try{
      statement-1;
      statement-2;
      try{
         statement-1;
         statement-2;
      }
      catch(exception e){
         //exception e
      }
   }
   catch(exception e){
      //exception e
   }
}
catch(exception e){
//exception e
}

```

## Throw Exception

The Java throw keyword is used to throw an exception explicitly. We specify the exception object which is to be thrown. The Exception has some message with it that provides the error description. These exceptions may be related to user inputs, server, etc.
We can throw either checked or unchecked exceptions in Java by _throw_ keyword. It is mainly used to throw a custom exception. We will discuss custom exceptions later in this section.

**Note**: _If we throw unchecked exception from a method, it is must to handle the exception or declare in throws clause._

**Note**: _Every subclass of Error and RuntimeException is an unchecked exception in Java. A checked exception is everything else under the Throwable class._
