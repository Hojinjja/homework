import java.util.Scanner;

public class number49 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int clock = scan.nextInt();
    int min = scan.nextInt();

    if (clock <0 || clock >=24) {
      System.out.println("시간을 잘못 입력하셨습니다.");
      return;
    }
    if(min<0 || min>=60){
      System.out.println("분을 잘못 입력하셨습니다.");
      return;
    }

    System.out.println("입력한 시간은 :"+clock+"시"+min+"분");

    int new_clock = clock;
    int new_min = min;

    // 시간이 0~23일 때 30분 전 시간 구하기
    if(new_clock<24){
      new_clock = clock;
      if(min<30){
        new_clock = clock-1;
        new_min = min+60-30;
      }

      else if(min>=30){
        new_clock = clock;
        new_min = min-30;
      }
    }

    // 시간이 0시보다 작을 때 30분전 시간 구하기
    else if(new_clock<0){
      new_clock = clock+24;
      if(min<30){
        new_clock = clock-1;
        new_min = min+60-30;
      }
      else if(min>=30){
        new_clock = clock;
        new_min = min-30;
      }
    }

    /*
    // 시간이 24시보다 클 때 30분 후 시간 구하기
    else if(new_clock>=24){
      new_clock = new_clock-24;
      if(min<30){
        new_clock = clock;
        new_min = min+30;
      }

      else if(min>=30){
        new_clock = clock+1;
        new_min = min+60-30;
      }
    }

     */
    System.out.println("30분 전 시간은: "+new_clock+"시"+new_min+"분");
  }
}
