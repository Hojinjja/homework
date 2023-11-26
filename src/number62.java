import java.util.Scanner;

public class number62 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("학년 입력하세요");
    int a = scan.nextInt();
    System.out.println("반을 입력하세요");
    int b = scan.nextInt();
    System.out.println("번호를 입력하세요");
    int c = scan.nextInt();

    System.out.print(a);
    System.out.printf("%02d", b);
    System.out.printf("%02d", c);
  }
}