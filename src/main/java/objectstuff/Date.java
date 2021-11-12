package objectstuff;

import java.util.List;

public class Date {
  // private means: "only accessible inside the enclosing TOP-LEVEL
  // curly braces that enclose the declaration
  private int month;
  private int day;
  private int year;

  // can declare classes (types) inside other classes (types)
  class X {
    private int y;
  }

  // if NO constructor specified, compiler creates
//  public Date() {
//    super();
//  }

  // constructor! NO RETURN TYPE, name is EXACTLY the classname
  // not a "constructor" (does not construct anything!!!)
  // it's really an INITIALIZER, and it initializes that hidden
  // or implicit "this" value
  public Date(/*implicit argument Date this*/int d, int m, int y) {
    if (d < 1 || d > daysInMonth(m, y) /*|| m < 1 || m > 12*/) {
      throw new IllegalArgumentException("Bad date values");
    }
    this.day = d;
    this.month = m;
    this.year = y;
  }

  public Date(int d, int m) {
    this(d, m, 2021); // delegate to the other constructor
    // use of this().. MUST COME FIRST
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

  public int dayOfWeek(Date this) {
    return dayOfWeek(this.day, this.month, this.year);
  }

  public static int getDay(Date d) {
    return d.day;
  }
// remove "static", then first argument must be
  // of the enclosing class type, and must be called this
  // if it isn't there, it's implied
  public int getDay(Date this) {
//    int day = 99;
    return /*this.*/day;
  }

  public static void setDay(Date d, int newDay) {
    if (newDay < 1 || newDay > daysInMonth(d.month, d.year)) {
      throw new IllegalArgumentException("Bad day for this date");
    }
    d.day = newDay;
  }

  public void setDay(Date this, int newDay) {
    if (newDay < 1 || newDay > daysInMonth(this.month, this.year)) {
      throw new IllegalArgumentException("Bad day for this date");
    }
    this.day = newDay;
  }

  public String toString(/*Date this*/) {
    return "A date of day=" + this.day + " month=" + this.month
        + " year=" + this.year;
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
//    Date today = new Date(12, 11, 2021);
    Date today = new Date(12, 11, 2021);
//    today.day = 0; // bad
    System.out.println("Today (again) is " + dayOfWeek(today));
  }
}

class Holiday extends Date {
  private String name;
  public Holiday(int d, int m, int y, String name) {
    // if no super(...) compiler generates super()...
    super(d, m, y);
    this.name = name;
  }

  @Override
  public String toString(/*Date this*/) {
    return super.toString() + " a holiday called " + /*this.*/name;
  }
}