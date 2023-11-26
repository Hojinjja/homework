import java.util.Scanner;

public class number42 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("슬기가 던진 거리?");
    float a = scan.nextFloat();

    if (50 <= a && a <= 70 || (a%6 ==0)) {
      System.out.println("승리");
    } else {
      System.out.println("패배");
    }
  }
}
