import java.util.Scanner;

public class number40 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("슬기가 던진 거리?");
    float a = scan.nextFloat();

    if (50 <= a && a <= 60) {
      System.out.println("승리");
    } else {
      System.out.println("패배");
    }
  }
}
