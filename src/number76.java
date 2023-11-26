import java.util.Scanner;

public class number76 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int m = scan.nextInt();
    int result = n;
    for (int i = 1; i <m; i++) {
      result = result * n;
    }
    System.out.println(result);
  }
}
