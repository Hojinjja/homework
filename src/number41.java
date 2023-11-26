import java.util.Scanner;

public class number41 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("슬기가 던진 거리?");
    int a = scan.nextInt();

    if (50 <= a && a <= 60 || 60<= a && a <=70) {
      System.out.println("승리");
    } else {
      System.out.println("패배");
    }
  }
}
