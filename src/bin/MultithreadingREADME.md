# MultiThreading in JAVA

**J**ava is a **multi-threaded** programming language which means we can develop multi-threaded program using Java. A multi-threaded program contains two or more parts that can run concurrently and each part can handle a different task at the same time making optimal use of the available resources specially when your computer has multiple CPUs.
**_Multithreading_** refers to a process of executing two or more threads simultaneously for maximum utilization of the CPU. A _thread_ in Java is a lightweight process requiring fewer resources to create and share the process resources.

## What is Thread??

A Thread is lightweight subprocess, the smallest unit of processing. it is a separate path of execution.
Threads of independent. if there occurs exception in one thread, it doesn't affect other threads. it uses a shared memory area.

## Java Thread class

Java provides Thread class to achieve thread programming. Thread class provides constructors
and methods to create and perform operations on a thread. Thread class extends Object class
and implements Runnable interface.

## Life Cycle of Thread

In java, a thread always exists in any one of the following ways. They are:

1. New
2. Active
3. Block/Waiting
4. Time waiting
5. Terminated

**_NEW_**:
Whenever a new thread is created, it is always in the new state. For a thread in the new state, the code has not been run yet and thus has not begun its execution.

**_Active_**: When a thread invokes the start() method, it moves from the new state to the active state. The active state contains two states within it: one is runnable, and the other is running.

- **Runnable**: A thread, that is ready to run is then moved to the runnable state. In the runnable state, the thread may be running or may be ready to run at any given instant of time. It is the duty of the thread scheduler to provide the thread time to run, i.e., moving the thread the running state.
  A program implementing multithreading acquires a fixed slice of time to each individual thread. Each and every thread runs for a short span of time and when that allocated time slice is over, the thread voluntarily gives up the CPU to the other thread, so that the other threads can also run for their slice of time. Whenever such a scenario occurs, all those threads that are willing to run, waiting for their turn to run, lie in the runnable state. In the runnable state, there is a queue where the threads lie.
- **Running**: When the thread gets the CPU, it moves from the runnable to the running state. Generally, the most common change in the state of a thread is from runnable to running and again back to runnable.

**_Blocked or Waiting_**: Whenever a thread is inactive for a span of time (not permanently) then, either the thread is in the blocked state or is in the waiting state.

**_Timed Waiting_**: Sometimes, waiting for leads to starvation. For example, a thread (its name is A) has entered the critical section of a code and is not willing to leave that critical section. In such a scenario, another thread (its name is B) has to wait forever, which leads to starvation. To avoid such scenario, a timed waiting state is given to thread B. Thus, thread lies in the waiting state for a specific span of time, and not forever. A real example of timed waiting is when we invoke the sleep() method on a specific thread. The sleep() method puts the thread in the timed wait state. After the time runs out, the thread wakes up and start its execution from when it has left earlier.

**_Terminated_**: A thread reaches the termination state because of the following reasons:
When a thread has finished its job, then it exists or terminates normally.
Abnormal termination: It occurs when some unusual events such as an unhandled exception or segmentation fault.

**Threads** can be created by using two mechanisms :

1. Extending the Thread class.
2. Implementing the Runnable Interface.

Thread Class vs Runnable Interface

1. if we extend the Thread class, our class cannot extend any other class because Java doesn't support multiple inheritance. But, if we implement the Runnable Interface , our class can still extend other base classes.
2. We can achieve basic functionality of thread by extending Thread class because it provides some inbuilt methods like yields() interrupt() etc. that are not available in Runnable interface.
3. Using runnable will give you an object that can be shared amongst multiple threads.
