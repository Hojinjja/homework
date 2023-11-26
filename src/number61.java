import java.util.Scanner;

public class number61 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("숫자를 입력해 주세요>");
    int a = scan.nextInt();
    System.out.print("연산자를 입력해 주세요>");
    String cal = scan.next();
    System.out.print("숫자를 입력해 주세요>");
    int b = scan.nextInt();

    switch(cal) {

      case "+":
        System.out.println(a+"+"+b+"="+a+b);
        break;
      case "-":
        System.out.println(a+"-"+b+"="+(a-b));
        break;
      case "*":
        System.out.println(a+"x"+b+"="+(a*b));
        break;
      case "/":
        System.out.println(a+"/"+b+"="+((float)a/(float)b));  // (float) 형변환
        break;

    }


  }
}
