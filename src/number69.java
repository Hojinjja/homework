import java.util.Scanner;

public class number69 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int a = scan.nextInt();
    int d = scan.nextInt();
    int n = scan.nextInt();



    for (int i = 1; i <=n; i++) {
      System.out.println(a+(i-1)*d);
    }
  }
}
