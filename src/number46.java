import java.util.Scanner;

public class number46 {


  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int turnel = scan.nextInt();
    int turnel2 = scan.nextInt();
    int turnel3 = scan.nextInt();

    int car = 170;

    if (turnel >= 170) {
      System.out.println("PASS");
    } else {
      System.out.println("FAIL");
    }

    if (turnel2 >= 170) {
      System.out.println("PASS");
    } else {
      System.out.println("FAIL");
    }

    if (turnel3 >= 170) {
      System.out.println("PASS");
    } else {
      System.out.println("FAIL");

    }
  }
}