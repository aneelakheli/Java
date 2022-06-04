## Java _This_ Method

within an instance method or a constructor, **this** is a reference to the _current object_ -- the object whose method or constructor is being called.

here is given the 6 usage of java this keyword:

1. this can be used to refer current class instance variable.
2. this can be used to invoke current class method(implicity).
3. this() can be used to invoke current class constructor.
4. this can be passed as an argument in the method call.
5. this can be passed as an argument in the constructor call
6. this can be usd to return the current class instance from the method.

**This: to invoke current class constructor**
The this() constructor call can be used to invoke the current class constructor. It is used to reuse the constructor. In other words, it is used for constructor chaining.

**This : to Invoke current class Method**

we may invoke the method of the current class by using the this keyword. if we don't use the this keyword, compiler automatically adds this keyword while invoking the method .

**argument in the constructor call**

We can pass the this keyword in the constructor also. It is useful if we have to use one object in multiple classes

**this keyword can be used to return current class instance**
We can return this keyword as an statement from the method. In such case, return type of the method must be the class type (non-primitive)

**syntax**

```java
    return_type method_name(){
        __return this;__
    }
```

**Real usage of _this()_ constructor call**
The this() constructor call should be used to reuse the constructor from the constructor. It maintains the chain between the constructors i.e. it is used for constructor chaining. Let's see the example given below that displays the actual use of this keyword

```java
        class Student{
            int rollno;
            String name,course;
            float fee;
            Student(int rollno,String name,String course){
                this.rollno=rollno;
                this.name=name;
                this.course=course;
            }
            Student(int rollno,String name,String course,float fee){
                this(rollno,name,course);//reusing constructor
                this.fee=fee;
            }
            void display(){
                System.out.println(rollno+" "+name+" "+course+" "+fee);
                }
        }
        class TestThis7{
            public static void main(String args[]){
                Student s1=new Student(111,"ankit","java");
                Student s2=new Student(112,"sumit","java",6000f);
                s1.display();
                s2.display();
        }}

```
