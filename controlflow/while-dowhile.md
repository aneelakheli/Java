# The While and Do-While Statements

## 1. While

The **while** statement continually executes a block of statements while a particular condition is _true_. its syntax can be expressed as:

```
   while( expression){
       statements(s)
   }
```

The _while_ statements evaluates _expression_, which must return a _boolean_ value. if the expression evaluates to _true_, the _while_ statements continues testing the expression and executing its block untill the expression evaluates to _false_. Using the _while_ statements tp print the values from 1 through 5 can be accomplished as in the [WhileDemo](WhileDemo.java) program.

we can implement an infinite loop using the _while_ statement as follows:

```
    while(true){
        //code goes here
    }
```

## 2. Do While

The java programming language provides a _do-while_ statement, which can be expressed as follows:

```
    do{
        statement(s)
    }while( expression);
```

The difference between _do-while_ and _while_ is that **do-while** evaluates at the bottom of the loop instead of the top. Therefore, the statements within the **do** block are always executed at least once, as shown in the [DoWhile](DoWhile.java) program.
