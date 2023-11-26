import java.util.Scanner;

public class number83 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    for(int i=1 ; i<=n ; i++){
      for(int j=1 ; j<=i; j++){
        System.out.printf("*"); //print 하면 줄바꿈 없이 옆으로 출력
      }

      System.out.println();
    }
  }

}
