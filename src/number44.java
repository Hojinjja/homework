import java.util.Scanner;

public class number44 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    String str = "";

    if (n == 1) {
      str = "월요일";
    } else if (n == 2) {
      str = "화요일";
    } else if (n == 3)
    {
      str = "수요일";
    }
    else if (n == 4) {
      str = "목요일";
    } else if (n == 5) {
      str = "금요일";
    } else if (n == 6) {
      str = "토요일";
    } else if (n == 7) {
      str = "일요일";
    }

    if (str == "월요일" || str == "수요일" || str == "금요일" || str == "일요일") {
      System.out.println("oh my god!!");
    } else {
      System.out.println("enjoy");

    }
  }
}