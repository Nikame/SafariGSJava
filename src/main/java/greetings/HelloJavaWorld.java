
// comments and whitespace

package greetings; // must be at the top!

// import statements must start from the "root package"
//import java.lang.System;
// import everything from a package using asterisk
// everything in java.lang is always imported :) automatically
//import java.lang.*;
// static imports can shorten uses of static features of some
// element of an api
import static java.lang.System.out;
//import static java.lang.System.*;

public class HelloJavaWorld {
//  var name = "Fred"; // var NOT PERMITTED for field declarations
  // "real code" MUST be INSIDE a type (class in this case)

  // entry point to a Java program is the "main" method
  public static void main(String[] args) {
    // String/text literals are DOUBLE quotes ONLY
    // single quotes make single "char" values
//    java.lang.System.out.println("Hello Java World!");
//    System.out.println("Hello Java World!");
    out.println("Hello Java World!");

    // SINCE Java 10 only
//    var x = 99;
    int x = 99;
// cannot use a variable of one type to store any other type
//    x = "Hello";
    // basic types are "8 primitive type"
    // boolean -- all "test" structures MUST use a boolean
    // THERE IS NOT "truthy/falsy" concept
    // byte, short, int, long -- integer types of various widths
    // char -- unsigned integer type representing characters
    // float, double -- 32/64 bit floats
    // BigDecimal, BigInteger for arbitrary precision limited only by memory

    // division: / gives integer division with 2 integer types, or floating
    // results if either type is floating
    // + - * / % ( % is remainder, not mod)
    // result type will be the "larger" of the two argument types
    // but never less than int

    // comparisons > < >= <= != ==
    // NEED TO TALK ABOUT EQUALITY

  }
}

// "default" access means "in the same package"
class Other {}
