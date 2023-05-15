package mainday38;

/* Given two strings, a and b, return 
The result of putting them together in the order abba,
e.g. "Hi" and "Bye" returns "HiByeByeHi".
*/

public class Code02 {

    public String makeAbba(String a, String b) {
        return (a + b + b + a);
    }

    public static void main(String[] args) {
        Code02 c = new Code02();
        // String s1 = c.makeAbba("Hi", "Bye");
        // String s2 = c.makeAbba("Yo", "Alice");
        String s3 = c.makeAbba("What", "Up");

        System.out.println(s3);
    }
}

/*
 * 
 * HiByeByeHi
 * YoAliceAliceYo
 * WhatUpUpWhat
 */