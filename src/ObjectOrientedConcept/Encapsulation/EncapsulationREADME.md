# Java Encapsulation

### Java package

A java package is a group of similar types of classes, interfaces and sub-packages. Package in java can be categorized in two form, built-in package and user-defined package. There are many built-in packages such as java, lang, awt, javax, swing, net, io, util, sql etc. Here, we will have the detailed learning of creating and using user-defined packages.

**Advantage of Java Package.**

1. Java package is used to categorize the classes and interfaces so that they can be easily maintained.
2. Java package provides access protection.
3. Java package removes naming collision.

The **package** keyword is used to create a package in java.

**_How to access package from another package?_**
There are three ways to access the package from outside the package.

import package.\*;
import package.classname;
fully qualified name.

### Access Modifiers in Java

There are two types of modifiers in Java: **_access modifiers_** and **_non-access modifiers_**.

The access modifiers in Java specifies the accessibility or scope of a field, method, constructor, or class. We can change the access level of fields, constructors, methods, and class by applying the access modifier on it.

There are four types of Java access modifiers:

1. **Private**: The access level of a private modifier is only within the class. It cannot be accessed from outside the class.
2. **Default**: The access level of a default modifier is only within the package. It cannot be accessed from outside the package. If you do not specify any access level, it will be the default.
3. **Protected**: The access level of a protected modifier is within the package and outside the package through child class. If you do not make the child class, it cannot be accessed from outside the package.
4. **Public**: The access level of a public modifier is everywhere. It can be accessed from within the class, outside the class, within the package and outside the package.

There are many non-access modifiers, such as _static_, _abstract_, _synchronized_, _native_, _volatile_, _transient_, etc. Here, we are going to learn the access modifiers only.

| Access Modifier | Within class | within Package | outside package by subclass only | outside package |
| :-------------: | :----------: | :------------: | :------------------------------: | :-------------: |
|     Private     |     Yes      |       No       |                No                |       No        |
|     Default     |     Yes      |      Yes       |                No                |       No        |
|    Protected    |     Yes      |      Yes       |               Yes                |       No        |
|     Public      |     Yes      |      Yes       |               Yes                |       Yes       |
