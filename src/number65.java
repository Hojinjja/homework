public class number65 {
  public static void main(String[] args) {

    int i;
    for (i = 1; i <= 40; i++) {
      if (i % 10 ==3 || i%10==6 || i%10==9 || i/10==3 || i/10==6 || i/10==9) {
        System.out.println("X");
      }
      else{
        System.out.println(i);
      }
    }

  }
}