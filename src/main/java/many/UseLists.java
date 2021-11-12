package many;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UseLists {
  public static void main(String[] args) {
    // List is one element of java's "collections" api
    // docs in java.util package
    // Iterable, Collection, List, Set, Map, Deque

    // Parent classes, abstract parent classes, interfaces
    // inteface describes what interactions (methods) will be
    // provided, without actually providing them
    // ArrayList is a concrete class
    // implements the List interface

//    List<String> names = new ArrayList<String>();
    // type inferencing "diamond operator"
    // List.of is Java 9 or newer
    // List.of makes an unmodifiable (almost immutable) list
//    List<String> names = new ArrayList<>(List.of("Fred", "Jim", "Sheila"));
    List<String> names = new ArrayList<>(Arrays.asList("Fred", "Jim", "Sheila"));
    System.out.println(names);
    System.out.println("second name is " + names.get(1));
  }
}
