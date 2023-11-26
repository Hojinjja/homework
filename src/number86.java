import java.util.Scanner;

  public class number86 {
    public static void main(String[] args) {
      // 사용자로부터 홀수를 입력받기
      Scanner scanner = new Scanner(System.in);
      System.out.print("홀수를 입력하세요: ");
      int n = scanner.nextInt();

      // 입력된 홀수만큼 별 패턴 출력
      if (n % 2 == 1) {
        printStarPattern(n);
      } else {
        System.out.println("홀수를 입력하세요.");
      }

      // Scanner 닫기
      scanner.close();
    }

    // 별 패턴 출력 메서드
    public static void printStarPattern(int n) {
      for (int i = 1; i <= n; i += 2) {        //1,3,5,~~~ 홀수 진행
        // 공백 출력
        for (int j = 0; j < (n - i) / 2; j++) { // ex) n=5,i=0이면 -> 5/2 =2 이므로 , 1번째 자리에 공백을 출력
          System.out.print(" ");
        }

        // 별 출력
        for (int j = 0; j < i; j++) { // ex) i=5 이면 , j=0,1,2,3,4 -> 총 5개의 별 출력
          System.out.print("*");
        }

        // 줄 바꿈
        System.out.println();
      }
    }
  }
