import java.io.*;
import java.util.*;

public class Linearization {

  public static void main(String[] args) {

    // initializing three char arrays
    char[] inarr1 = new char[] { 'x', 'y', 'b', 'a' };
    char[] inarr3 = new char[inarr1.length];
    int repeat = 0;
        
        int count_if_LCompare = 0;
        int count_if_CCompare = 0;
        int count_for = 0;
        int count_while = 0;

    Scanner input = new Scanner(System. in );
    String str = input.next();

    inarr3 = str.toCharArray();


    long lStartTime2 = System.nanoTime();
    while (repeat != inarr1.length) {
      if (inarr1.length != inarr3.length) {
        System.out.println("False. They are not equal");
                count_if_LCompare++;
      } else {
        boolean isEqual = true;
        for (int i = 0; i < inarr1.length; i++) {
          if (inarr1[i] != inarr3[i]) {
            System.out.println("False.they are not equal");
                        count_if_CCompare++;
            
            isEqual = false;
            break;
          }
                    count_for++;
        }
        if (isEqual) System.out.println("true.they are equal");
      }
      repeat++;
            count_while++;
    }
    long lEndTime2 = System.nanoTime();
    System.out.println("Time used: " + ((lEndTime2 - lStartTime2)/inarr1.length));
  }
}

//NOTE: The program may or may not always give proper time taken approximations,
//specially on newer machines