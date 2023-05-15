# **Core Java**

What is Java Method?
It is a place where w will be writing the business logic.

## Syntax of Java Method

```Java
//Method:
<AccessModifier> ReturnType <MethodName>() {
-----------------------------------;
 ----------------------;//Method body (or)
-----------------------; //Method Functionality (or) // Method Implementation
-----------------------------------;
}

EXAMPLE:
Public void msg() {
-----------------------------------;
------------CodeBlock--------------;
-----------------------------------;
}
```

### **ReturnType**:

For returning a value from a method we will be having four ( 4 ) Options :

1. Void
2. All 8 primitive Data Types
3. Classes
4. Interfaces

**Void**:
Void method doesn't return anything

**Primitive Datatypes:**
INT, Byte, Short, Long, Float, Double, Char, Boolean

Q. How many methods we can write inside a class?
we can write any number of methods in side a java class

Q. When will be a java method be executed ?
A java method will be executed whenever we are calling it. if we don’t call it it doesn't execute.

Q. How to call a Java Method ?
We need to call a Java Method with help of its respective CLASS OBJECT.

Q. How to create a class object ?
We need to create a class object with the help of “New” Keyword and initialize that class object with the help of a constructor (_Constructor name will be same as class name_)

```Java
ClassA aobj = new ClassA();   //creation of ClassA object

ClassB aobj = new ClassB();   //creation of ClassB object

ClassC aobj = new ClassC();   //creation of ClassC object
```
