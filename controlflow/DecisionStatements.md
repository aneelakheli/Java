# Decision Making Statements#

**_Decision making statement_** decide which statement to execute and when. Decision making statements evaluate the boolean expression and control the program flow depending upon the result of the condition provided.

There are two types of decision making statements in java

1. IF statements
2. Switch statements

## 1. IF Statements

The **_IF_** statements is the most basic of all the control flow statements. it tells out program to execute a certain section of code _only_ if a particular test evaluates to **TRUE**.
Syntax of if statements is given below.

```
   if(condition){
       statement 1; //executes when condition is true
   }
```

## IF ELSE Statements

The **_IF ELSE_** statements provides a secondary path of execution when an _"if"_ clause evaluates to _false_.

**Syntax**

```
   if(condition){
       statement 1; // executes when condition is true
   }
   else{
       statement 2 // executes when condition is false
   }
```

## IF-ELSE-IF Ladder

The **_If-else-IF_** statement contains the if-statement followed by multiple else-if statements. In other words, we can say that it is the chain of if-else statements that create a decision tree where the program may enter in the block of code where the condition is true. We can also define an else statement at the end of the chain.

**Syntax**

```
    if(condition 1) {
        statement 1; //executes when condition 1 is true
    }
    else if(condition 2) {
        statement 2; //executes when condition 2 is true
    }
    else {
        statement 2; //executes when all the conditions are false
    }
```
