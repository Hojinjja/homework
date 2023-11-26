import java.util.Scanner;

public class number89 {
  public static void main(String[] args) {
    // 사용자로부터 합 k를 입력받기
    Scanner scanner = new Scanner(System.in);
    System.out.print("두 주사위의 합을 입력하세요: ");
    int k = scanner.nextInt();

    // 주사위 두 개를 굴려 합이 k가 되는 경우 출력
    printDiceCombinations(k);

    // Scanner 닫기
    scanner.close();
  }

  // 합이 k가 되는 주사위 두 개의 조합 출력 메서드
  public static void printDiceCombinations(int k) {
    // 두 주사위의 눈은 1부터 6까지이므로 각 주사위의 눈에 대해 조합을 확인
    for (int i = 1; i <= 6; i++) {
      for (int j = 1; j <= 6; j++) {
        // 두 주사위의 눈의 합이 k인 경우 출력
        if (i + j == k) {
          // 작은 수에서 큰 수 순서로 출력
          System.out.println(i + " " + j);
        }
      }
    }
  }
}