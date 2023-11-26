import java.util.Scanner;

public class number82 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int start = scan.nextInt();
    int finish = scan.nextInt();
    for(int a = start ; a<=finish ; a++){
      for(int b=1 ; b<=9 ; b++){
        System.out.println(a+"*"+b+"="+a*b);
      }
    }
  }
}
