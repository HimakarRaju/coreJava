# **Day 03**

## First Program

```Java
public class FirstProgram{
 public void meth1(){
  System.out.println("Hello World");
 }
 private void meth2(){
  System.out.println("JAVA is awesome!");
 }
}

/*
 * Error: Could not find or load main class in
 * FirstProgram
 *
 */
```

Q. How to see the output of our Java Program ?
If we want to see the output of our java program we need to perform “2” two tasks:

1. Compilation
2. Running

```Java
public class ClassA{
 public void meth1(){
  ClassA obj = new ClassA();
  System.out.println("meth1() called");
  aobj.meth2();
  System.out.println("Hello World");
 }
 public void meth2(){
  ClassA obj = new ClassA();
  System.out.println("meth2() called");
  System.out.println("JAVA is awesome!");
 }
 public static void main(String args[]){
  System.out.println("start");
  ClassA obj = new ClassA(); //creating an object
  aobj.meth1();              //we are calling meth1()
  System.out.println("End");
 }
}

/*
 * start
 * meth1() called
 * meth2() called
 * JAVA is awesome!
 * Hello World
 * End
 *
 */
```
