package flowcontrol;

public class UseSwitch {
  public static void main(String[] args) {
    int x = 2;
    // switch ONLY on int and smaller integer types, String,
    // and enum types
    switch(x) {
      case 1:
      case 2:
      case 3:
        System.out.println("it's one, two, or three");
        break;
      case 99:
        System.out.println("it's 99");
        break;
      default:
        System.out.println("it's something else");
        break;
    }
  }
}
