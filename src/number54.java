import java.util.Scanner;

public class number54 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("a의 값을 입력하세요>");
    int a = scan.nextInt();
    System.out.println("b의 값을 입력하세요>");
    int b = scan.nextInt();

    if(b%a==0) {
      System.out.println(a+"*"+b+"="+(a*b));
    }else if(a%b==0) {
      System.out.println(b+"*"+a+"="+(a*b));
    }else {
      System.out.println("none");
    }

  }
}
