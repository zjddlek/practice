package p_2_15;

import java.util.Scanner;

public class testVariavles_for문_연습 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//내가한거
//		Scanner sc = new Scanner(System.in);
//		int dan;
		
	//빼먹은 부분 : System.out.print("단을 입력하세요."); //출력문
	//빼먹은 부분 : dan = sc.nextInt(); //키보드로 단 수를 입력받아 dan 변수에 저장
//
//		for(int i = 1; i<10; i++) {
//		System.out.print(i  + " * " + j + " = " + i * j);
//		}
//		
//		sc.close();
		
		//조건문만 적어서 구구단 만들기.
		int dan;
		int i = 1; //for의 초기화식.
		
		System.out.print("단을 입력하세요."); //출력문
		dan = sc.nextInt(); //키보드로 단 수를 입력받아 dan 변수에 저장
		 for(; i<10;) { //초기화식 생략, 조건문만 적음.
			 //구구단 출력 코드
			 System.out.println(dan + "*" + i + "= " + dan * i);
			 i++; //반복문 요기다가 적어도 됨.
		 }
		 sc.close();
	}

}
