package many;

import java.util.Arrays;

public class UseArrays {
  public static void main(String[] args) {
    String [] sa = new String[3];
    // arrays are FIXED size after creation
    sa[0] = "Fred";
    System.out.println("sub-zero is " + sa[0]);
    System.out.println("sub-one is " + sa[1]);

//    int [] ia = new int[]{};
    int [] ia = new int[]{0, 1, 2, 3, 4, 5};
    // java arrays are indexed from zero, must be contiguous numbering
    System.out.println("length of ia is " + ia.length);

    // Check documentation on System.arraycopy
    // and also java.util.Arrays

  }
}
