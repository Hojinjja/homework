import java.util.Random;
import java.util.Scanner;

public class number100 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    // 1에서 100까지의 랜덤 숫자 생성
    int targetNumber = random.nextInt(100) + 1;

    int userGuess;
    int attempts = 0;

    System.out.println("1에서 100까지의 숫자를 맞춰보세요!");

    do {
      // 사용자로부터 숫자 입력 받기
      System.out.print("숫자를 입력하세요: ");
      userGuess = scanner.nextInt();

      // 시도 횟수 증가
      attempts++;

      // 입력한 숫자와 컴퓨터가 선택한 숫자 비교
      if (userGuess < targetNumber) {
        System.out.println("더 큰 숫자를 입력하세요.");
      } else if (userGuess > targetNumber) {
        System.out.println("더 작은 숫자를 입력하세요.");
      } else {
        System.out.println("정답을 맞췄습니다.");
        System.out.println("시도한 횟수: " + attempts + "회");
      }
    } while (userGuess != targetNumber);

    // Scanner 닫기
    scanner.close();
  }
}
