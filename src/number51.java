import java.util.Scanner;

public class number51 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("1부터 99까지의 값을 입력하시오>");
    int i = scan.nextInt();

    int j = i/10;   // 10의 자리를 1의 자리로 바꿈
    int h = i%10;   // 1의 자리를 10의 자리로 바꿈
    int result = ((h*10)+j)*2;

    System.out.println(result);
    if(i<=99 && i>=1) {
      if(result<=50) {
        System.out.println("GOOD");
      }else {
        System.out.println("OH MY GOD");
      }
    }else {
      System.out.println("수를 다시 입력해주세요.");
    }
  }
}
