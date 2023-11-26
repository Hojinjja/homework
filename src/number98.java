import java.util.Scanner;

public class number98 {
  public static void main(String[] args) {

    int[][] board = new int[10][10];
    for(int i=0; i<10; i++) {
      for(int j=0; j<10; j++) {
        board[i][j] = 0; //초기화
      }
    }
    Scanner scan = new Scanner(System.in);
    System.out.print("n값:");
    int n = scan.nextInt();

    int[][] xy = new int[10][2];
    for(int i=0; i<n; i++) {
      System.out.print("X:");
      xy[i][0] = scan.nextInt();
      System.out.print("Y:");
      xy[i][1] = scan.nextInt();
    }
    for(int i=0; i<n; i++) {
      int x = xy[i][0] - 1;
      int y = xy[i][1] - 1;
      board[x][y] = 1;
    }
    for(int i=0; i<10; i++) {
      for(int j=0; j<10; j++) {
        System.out.print(board[i][j]+" ");
      }
      System.out.println();
    }

  }
}
