# MultiThreading in JAVA

**J**ava is a **multi-threaded** programming language which means we can develop multi-threaded program using Java. A multi-threaded program contains two or more parts that can run concurrently and each part can handle a different task at the same time making optimal use of the available resources specially when your computer has multiple CPUs.
**_Multithreading_** refers to a process of executing two or more threads simultaneously for maximum utilization of the CPU. A _thread_ in Java is a lightweight process requiring fewer resources to create and share the process resources.
Threads can be created by using two mechanisms :

1. Extending the Thread class.
2. Implementing the Runnable Interface.

## What is Thread??

A Thread is lightweight subprocess, the smallest unit of processing. it is a separate path of execution.
Threads of independent. if there occurs exception in one thread, it doesn't affect other threads. it uses a shared memory area.

## Java Thread class

Java provides Thread class to achieve thread programming. Thread class provides constructors
and methods to create and perform operations on a thread. Thread class extends Object class
and implements Runnable interface.
