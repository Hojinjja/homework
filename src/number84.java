import java.util.Scanner;

public class number84 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int i = scan.nextInt();
    for (int a = i; a>=1 ; a--){
      for (int b = 1; b<=a ; b++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}