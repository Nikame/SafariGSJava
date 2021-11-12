package flowcontrol;

public class UseLoops1 {
  public static void main(String[] args) {
    int count = 3;
    while (count > 0) {
      System.out.println("count is " + count);
//      count = count - 1;
//      count -= 1;
//      count--;
      --count;
    }
    System.out.println("count from loop is " + count);
    ;;; // null statements :)
    do {
      System.out.println("count in do while is " + count);
    } while (count != 0); // must have terminating semicolon

    for (int x = 3, y = 2; x > 0; x--, y++) {
      System.out.println("x is " + x + " and y is " + y);
    }
  }
}
