package p_2_15;

public class testVariavles_for문_연습2 {

	public static void main(String[] args) {
	 /* 1. for문을 이용하여 1~100까지 숫자를 출력하세요
		  for (초기식; 조건식; 증감식){
		            실행코드부분
		  }*/

		for(int i = 1; i < 101; i++) {
			System.out.println(i);
		}
		
		/*선생님이 한거
		 for(int i = 1; i <= 100; i++) {
			System.out.println(i);
			}*/
		
		System.out.println("=====================================");
		
	 // 2. for문을 이용하여 1~100까지 숫자중 홀수만 출력하세요.
	 // 선생님이랑 답 똑같다.
		
		for(int i = 1; i <=100; i++) {
			if( (i % 2) == 1) { // 5씩 증가하게 하려면 나머지를 0으로..
				System.out.println(i);
			}
		}
		
	System.out.println("=======================================");
		
	//if 안쓰고 하는 방법
		for(int i = 1; i <=100; i += 2) { // i += 2의 뜻은 2씩 증가
				System.out.println(i);
		}
		
	System.out.println("=======================================");	
	
	// 3. for이용 하여 10부터 1까지 출력하세요.
		/*for(int i = 10; i <=10; i--) {
			System.out.println(i); -> 이렇게 하면 i가 -로 무한증식 */
		for(int i = 10; i >=1; i--) {
			System.out.println(i);	
			
		}

	}

}
