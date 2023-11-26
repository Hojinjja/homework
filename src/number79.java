import java.util.Scanner;

public class number79 {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("입력하세요:");
    String str = scan.nextLine();
    for (int i = 0; i < str.length(); i++) { // i=0 부터 str의 길이만큼 반복
      char c = str.charAt(i); // 문자열 str에서 인덱스 i에 해당하는 문자를 가져와 변수 'c'에 저장

      if (c >= 'a' && c <= 'z') {
        System.out.print((char) (c - 32));    // 대문자-32 = 소문자 (대문자인 경우 소문자로 변환)
      } else if (c >= 'A' && c <= 'Z') {
        System.out.print((char) (c + 32));   // 소문자 +32 = 대문자 (소문자인 경우 대문자로 변환)
      } else {
        System.out.print(c); // 특수문자인 경우 그냥 출력
      }

    }
  }
}