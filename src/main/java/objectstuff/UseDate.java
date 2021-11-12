package objectstuff;

public class UseDate {
  public static void main(String[] args) {
    Date today = new Date(12, 11, 2021);
//    today.day = 0;
    // stuff not in our class must generally be "qualified"
    // i.e. it needs some kind of prefix
//    System.out.println("Today is " + Date.dayOfWeek(today));
    System.out.println("Today (again) is " + today.dayOfWeek());

//    System.out.println("day of today is " + Date.getDay(today));
    System.out.println("day of today is " + today.getDay());
//    Date.setDay(today, 13);
    today.setDay(13);
//    System.out.println("day of today is " + Date.getDay(today));
    System.out.println("day of today is " + today.getDay());

    Date newYearsDay = new Holiday(1, 1, 2022, "new year's day");
//    System.out.println("day of new years day is " + newYearsDay.getDay());
//    System.out.println("day of new years day is " + newYearsDay.toString());
    System.out.println("day of new years day is " + newYearsDay);
  }
}
