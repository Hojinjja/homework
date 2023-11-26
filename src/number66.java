import java.util.Scanner;

public class number66 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int a= scan.nextInt();
    int sum=0;

    for (int i=1 ; ; i++) {
      sum+=i;
      if (sum>=a){
        break;
      }
      System.out.println(i);
    }
    System.out.println("입력한 수보다 크거나 같으므로 종료 합니다.");
  }
}