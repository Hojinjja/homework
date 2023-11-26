import java.util.Scanner;

public class number36 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int dice1 = scan.nextInt();
    int dice2 = scan.nextInt();

    if (dice1>10)
      System.out.println("잘못된 값 입니다");

    if (dice2>10)
      System.out.println("잘못된 값 입니다.");

    for (int i=1;i<=dice1;i++ ){
      for (int j=1; j<=dice2;j++){
        System.out.println(i+""+j);
      }
    }


  }
}