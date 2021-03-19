package p_2_15;

public class testVariavles_if문_문제 {

	public static void main(String[] args) {
		int a = 4;
		int b = 15;
		
		//1. a변수의 값이 3의 배수인지 판별하고 맞다면 "3의 배수"와 변수값을 출력
		if ( (a % 3) == 0) { //3의 배수 판별법 
							 //만약 a를 3으로 나눴을때 나머지가 0이면
			System.out.println("3의 배수"); //출력해
		}else { //그렇지 않으면 
			System.out.println(a + "는 3의 배수가 아닙니다."); //출력해
		}
		//2. a, b변수의 값이 3의 배수인지 판별하고 둘다 맞다면 "3의 배수"와 변수값을 출력
		// &&(and = 둘 다 참인경우) ||(or = 둘 중 하나만 참이면 됨)
		if ( (a % 3 == 0) && ( b % 3 == 0)) {
			//만약 a를 3으로 나눴을때 나머지가 0이고, b를 3으로 나눴을때 나머지가 0이면
			System.out.println("3의 배수"); //출력해
		}else { //그렇지 않으면
			System.out.println("3의 배수가 아닙니다."); //출력해 

	}

}
}
