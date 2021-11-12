package many;

import java.util.List;

public class EnhancedForLoop {
  public static void main(String[] args) {
    List<String> names = List.of("Fred", "Jim", "Sheila");
    for (String name : names) {
      // this loop does NOT maintain any kind of counter / index
      System.out.println("> " + name);
    }
  }
}
