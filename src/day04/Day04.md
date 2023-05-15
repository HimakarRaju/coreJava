# **Day 04**

## Example Code 1

```Java
public class ClassA {
 void meth1() {
  int a = 100; // Variable   // Print outputs
  System.out.println("Hi");  //Hi
  System.out.println("10");  //10
  System.out.println("a");   //a
  System.out.println(a);     //100
  System.out.println(a+900); // 1000
 }
 void meth2() {
  int x = 99;
  int y = 1;
  System.out.println("Hello");
  System.out.println("X: "+x); // x=99
  System.out.println("Y: "+y); // y=1
  System.out.println("Addition: "+(x+y)); // Addition: 100
  }
 public static void main(String args[]) {
  System.out.println("Start");
  ClassA aobj =new ClassA();
  aobj.meth1();
  System.out.println("-----------------");
  aobj.meth2();
 }
}

/*OUTPUT
 *
 * Start
 * Hi
 * 10
 * a
 * 100
 * 1000
 * -----------------
 * Hello
 * X: 99
 * Y: 1
 * Addition: 100
 */
```

## Example Code 2

```Java
package samples;

public class ClassA {
 void add() {
  int a = 10; // Variable
  int b = 20;
  System.out.println("Addition: "+(a+b)); // Addition: 30
  }
 void sub() {
  int a = 100; // Variable
  int b = 99;
  System.out.println("Subtraction: "+(a-b)); // Subtraction: 30
  }
 void mul() {
  int a = 5; // Variable
  int b = 10;
  System.out.println("Multiplication: "+(a*b)); // Multiplication: 30
  }

  void div() {
   int a = 10; // Variable
   int b = 2;
   System.out.println("Division: " + (a + b)); // Division: 30
  }

  public static void main(String args[]) {
   ClassA aobj = new ClassA();
   aobj.add(); // Addition: 30
   aobj.sub(); // Subtraction: 1
   aobj.mul(); // Multiplication: 50
   aobj.div(); //Division: 5
  }
}

/*
 * Output
 *
 * Addition: 30
 * Subtraction: 1
 * Multiplication: 50
 * Division: 12
 */

```

Q. Which method will be executed automatically ?

```Java
main()

public static void main (String [] args) {
——code block——-;
}

```

**Note**: Without writing main() in our program we can't run our program. if we want to run a java program writing main is mandatory.
