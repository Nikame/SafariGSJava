package methodstuff;

import java.sql.SQLException;
import java.util.List;

public class ExampleOne {
  public static int daysInMonth(int month, int year) {
    if (month < 1 || month > 12) {
      throw new IllegalArgumentException("Bad month " + month);
    }
    // "generics" don't work with primitives
    // we must use the wrapper types instead.
    // but wrappers can "autobox" / "auto-unbox" with the matching primitve
    List<Integer> shortMonths = List.of(9, 4, 6, 11);
    // could use case/switch, if/else...
    if (shortMonths.contains(month)) return 30;
    if (month == 2) return isLeapYear(year) ? 29 : 28;
    else return 31;
  }
  // no default argument values in java...
  public static boolean isLeapYear(int year) {
    // & | bitwise operators not short circuiting
    // short circuit logical and && and or ||
    return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
  }

  // method overloading -- allows "equivalent computation"
  // with "different starting materials"
  // MUST DIFFER by type sequence of formal parmeters
  // "name" of a method is strictly package.type.name.type.of.arguments
  public static boolean isLeapYear() {
    return isLeapYear(2021);
  }

//  public static void showAllNames(String [] names) {
  public static void showAllNames(String ... names) {
    for (String s : names) {
      System.out.println("> " + s);
    }
  }

  public static void main(String[] args) {
    showAllNames(new String[]{"Fred", "Jim", "Sheila"});
    System.out.println("===========");
    showAllNames("Fred", "Jim", "Sheila");

    try {
      System.out.println("there are " + daysInMonth(2, 2020));
      if (Math.random() == -1) {
        throw new SQLException("the database broke");
      }
      System.out.println("there are " + daysInMonth(1, 2020));
      System.out.println("there are " + daysInMonth(-1, 2020));
      System.out.println("there are " + daysInMonth(9, 2020));
    } catch (SQLException sqe) {
      System.out.println("database issue " + sqe.getMessage());
    } catch (IllegalArgumentException t) {
      System.out.println("That broke with " + t.getMessage());
    }
    System.out.println("Still running the code");
  }
}
