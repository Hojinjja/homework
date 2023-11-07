import java.util.Scanner;

public class number20 {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();

    float sum = a+b+c;
    float result = (a+b+c)/3 ;
    System.out.println(sum);
    System.out.printf("%.2f", result);

  }
}