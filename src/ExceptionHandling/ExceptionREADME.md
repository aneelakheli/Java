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

Syntax:
A method catches an exception using a combination of the **try** and **catch** keywords. A try/catch block is placed around the code that might generate an exception. Code within a try/catch block is referred to as protected code, and the syntax for using try/catch looks like the following −

```java
   try{
   //Protected code
   }catch(Exception e){
   //catch block
   }

```
