import java.util.Scanner;

public class number45 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();
    int D = b * b - 4 * a * c;
    double value1 = 0;
    double value2 = 0;

    if (D == 0) {
      value1 = -b / (2 * a);
      System.out.println(value1);
    } else if (D > 0) {
      value1 = (-b + Math.sqrt(D)) / (2 * a);
      value2 = (-b - Math.sqrt(D)) / (2 * a);
      System.out.println(value1);
      System.out.println(value2);
    } else if (D < 0) {
      System.out.println("해가 없습니다");
    }

  }
}
