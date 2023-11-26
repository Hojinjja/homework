import java.util.Scanner;

public class number48 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int number = scan.nextInt();
    int sex = scan.nextInt();
    int birthyear = scan.nextInt();

    if (sex == 1 || sex == 2) {
      birthyear = 1900 + number / 10000;
    } else {
      birthyear = 2000 + number / 10000;
    }

    int age = 2018 - birthyear;
    System.out.println("나이는:" + age);
  }
}

