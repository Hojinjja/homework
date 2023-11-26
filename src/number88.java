import java.util.Scanner;

public class number88 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();

    int result = 0;
    for (int i =1; i <=a; i++) {
      int sum = 0;
      for (int j = 1; j <= i; j++) {
        sum += j;
      }
      result += sum;
    }

    System.out.println("수열의 합은:" + result);

  }
}