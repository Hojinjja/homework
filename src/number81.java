import java.util.Scanner;

public class number81 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int[] a = new int[5];
    for (int i = 0; i < 5; i++) {
      a[i] = scan.nextInt();
    }

    //최대값 계산
    int max = 0;
    for (int i = 0; i < 5; i++) {
      if (max < a[i]) {
        max = a[i];
      }

      //최소값 계산
      int min = Integer.MAX_VALUE; // 초기값으로 정수일때의 최대값을 설정한다
      for (int j = 0; j < 5; j++) {
        if (min > a[i]) {
          min = a[i];
        }
        System.out.println("최대값은? " + max);
        System.out.println("최소값은? " + min);
      }
    }
  }
}