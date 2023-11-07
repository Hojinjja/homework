import java.util.Scanner;

public class number21 {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    System.out.println("a는 0이상, b는 10이상의 값으로 입력하시오: ");


      int a = scan.nextInt();
      int b = scan.nextInt();

      if ( a>=0 & b<=10) {
        double result =Math.pow(a,b) ;
        System.out.println(result);

      } else {
        System.out.println("유효한 값으로 다시 입력하세요");
      }
    }

}