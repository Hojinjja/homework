import java.util.Scanner;

public class number18 {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    char c = str.charAt(0); //인덱스의 0번째 문자를 가져옴
    System.out.println((int)c); // (int) => 강제 형변환을 통해 ASCII 코드 만듦.

  }
}