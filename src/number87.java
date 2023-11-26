import java.util.Scanner;

public class number87 {
  public static void main(String[] args) {
    // 사용자로부터 홀수를 입력받기
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    for (int i = 0; i < a; i++) {
      for(int j=0; j<a;j++){
        if(i==0 || i==a-1){   // 첫 줄, 마지막 줄
          System.out.print("*"); // 각 인덱스에 * 찍기
        }
        else{ // 첫 줄, 마지막 줄이 아닌 경우
          if(j==0||j==a-1){ //각 줄의 첫번째 인덱스, 마지막 인덱스에 별찍기
            System.out.print("*");
          }else{//첫번째 , 마지막 인덱스 제외하고 나머지 부분은 공백
            System.out.print(""); // 각 줄의 첫번째 인덱스, 마지막 인덱스를 제외한 가운데 부분
          }
        }
      }
    }
  }
}
