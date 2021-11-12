package equality;

import static java.lang.System.out;

public class TryEquality {
  public static void main(String[] args) {

    String s1 = "Hello";
    String s2 = "He";

    // look for out.printf too :)
    out.println("s1 is " + s1);
    out.println("s2 is " + s2);

//    s2.toUpperCase(); // Strings are IMMUTABLE!!!
//    String s3 = s2.toUpperCase();
//    s2 = s2.toUpperCase();
    s2 = s2 + "llo";

    out.println("s2 is " + s2);

    if (s1 == s2) {
      out.println("they're the same!");
    } else {
      out.println("NOPE, not ==");
    }

    if (s1.equals(s2)) {
      out.println("they're the same using dot-equals !");
    } else {
      out.println("NOPE");
    }
    // String interning makes all *literal* strings
    // that have the same text reuse the same actual
    // object in memory. This is safe because
    // strings are IMMUTABLE
    String s3 = "Hello";
    if (s1 == s3) {
      out.println("they're the same == !");
    } else {
      out.println("NOPE, not ==");
    }

    // StringBuilder is mutable :)
    StringBuilder sb1 = new StringBuilder("Hello");
    StringBuilder sb2 = new StringBuilder("Hello");
    out.println("sb1 == sb2 are " + (sb1 == sb2 ? "" : "not ") + "equal");
    out.println("sb1.equals(sb2) are " + (sb1.equals(sb2) ? "" : "not ") + "equal");

  }
}
