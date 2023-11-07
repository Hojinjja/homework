import java.util.Scanner;

public class number15 {
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int year = scan.nextInt();
    int month = scan.nextInt();
    int day = scan.nextInt();
    String result = String.format("%04d.%02d.%02d",year,month,day);
    //format은 형식을 지정하는 문자열이다.

    System.out.printf(result);

  }
}
