package uselambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Example {
  public static void main(String[] args) {
    List<String> names = new ArrayList<>(List.of("Fred", "Jim", "Sheila"));
    System.out.println(names);
    // "test for a string"
    // boolean test(String s)
    // interface Predicate<String> defines this method
//    Predicate<String> longString = (String s) -> { return s.length() > 3;} ;
//    Predicate<String> longString = (s) -> { return s.length() > 3;} ;
//    Predicate<String> longString = (@Deprecated var s) -> { return s.length() > 3;} ;
//    Predicate<String> longString = s -> { return s.length() > 3;} ;
    Predicate<String> longString = s -> s.length() > 3 ;

    names.removeIf(longString);
    System.out.println("after:");
    System.out.println(names);
  }
}
