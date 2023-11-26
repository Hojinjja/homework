import java.util.Scanner;

public class number80 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    for (int i=0 ; str.length() > i ; i++){
      char c = str.charAt(i);
      System.out.print((char) (c-3));
    }
  }
}