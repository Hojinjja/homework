import java.util.Scanner;

public class number12 {
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    String A = scan.nextLine();
    if(A.length()<=50 )
      System.out.println(A);
    else{
        System.out.println("잘못된 글자 수");
    }
  }
}