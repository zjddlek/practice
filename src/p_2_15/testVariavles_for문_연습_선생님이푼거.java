package p_2_15;

import java.util.Scanner;

public class testVariavles_for문_연습_선생님이푼거 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int dan ;
    int i = 1;

    //출력문
    System.out.println("단을 입력하세요");
    
    // 키보드로 단 수를 입력 받아 dan 변수에 저장
    dan = sc.nextInt();
    
    for(;i<10;){
      // 구구단 출력 코드 
      System.out.println( dan + "*" + i + " = " + dan * i );
      i++;
    }
    sc.close();


  }

}
