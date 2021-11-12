package objectstuff;

import java.util.List;

public class Date {
  int day;
  int month;
  int year;

  // constructor! NO RETURN TYPE, name is EXACTLY the classname
  // not a "constructor" (does not construct anything!!!)
  // it's really an INITIALIZER, and it initializes that hidden
  // or implicit "this" value
  public Date(/*implicit argument Date this*/int d, int m, int y) {
    this.day = d;
    this.month = m;
    this.year = y;
  }

  public static boolean isLeapYear(int year) {
    return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
  }

  public static int daysInMonth(int month, int year) {
    if (month < 1 || month > 12) {
      throw new IllegalArgumentException("Bad month " + month);
    }
    List<Integer> shortMonths = List.of(9, 4, 6, 11);
    if (shortMonths.contains(month)) return 30;
    if (month == 2) return isLeapYear(year) ? 29 : 28;
    else return 31;
  }

  // Zeller's congruence 0 -> Saturday
  public static int dayOfWeek(int d, int m, int y) {
    if (m < 3) {
      m += 12;
      y--;
    }
    return (d + (13 * (m + 1) / 5) + y + y / 4 - y / 100 + y / 400) % 7;
  }

  public static int dayOfWeek(Date d) {
    return dayOfWeek(d.day, d.month, d.year);
  }

  public static void main(String[] args) {
    System.out.println("day of jan 1, 2020 was " + dayOfWeek(1, 1, 2020));
    int day = 12;
    int month = 11;
    int year = 2021;
    System.out.println("today is " + dayOfWeek(day, month, year));

//    Date today = new Date();
//    today.day = 0;
//    today.month = 11;
//    today.year = 2021;
    Date today = new Date(12, 11, 2021);
    System.out.println("Today (again) is " + dayOfWeek(today));
  }
}
