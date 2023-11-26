import java.util.Scanner;

public class number90 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // 출석 번호의 개수 입력 받기
    System.out.print("출석 번호의 개수를 입력하세요: ");
    int count = scanner.nextInt();

    // 출석 번호를 저장할 배열 선언
    int[] attendanceNumbers = new int[count];

    // 출석 번호 입력 받기
    System.out.println("랜덤으로 불린 출석 번호를 입력하세요:");
    for (int i = 0; i < count; i++) {
      attendanceNumbers[i] = scanner.nextInt();
    }

    // 출석 번호를 거꾸로 출력
    System.out.println("거꾸로 불린 출석 번호:");
    for (int i = count - 1; i >= 0; i--) {
      System.out.print(attendanceNumbers[i] + " ");
    }

    // Scanner 닫기
    scanner.close();
  }
}
