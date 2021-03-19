package p_2_15;

public class testVariavles_if문 {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		
		// 두 변수 a, b중 큰 변수의 값을 출력하세요.
		// 내가 한 방식.
		// 요 if문은 else까지 포함된것임. if에서 끝난거 아님.
		
		if (a > b) { //만약 a가 b보다 크면
			System.out.println("111111"); 
			//흐름을 확인하기 위해서 표시하는 코드 디버깅
			System.out.println(a); // a를 출력
		}else { // 반대로 b가 a보다 크면
			System.out.println("222222");
			//흐름을 확인하기 위해서 표시하는 코드 디버깅
			System.out.println(b); //b를 출력
		}
		
		/*선생님이 한 방식.
		 if (a > b) { //a가 b보다 크면
			System.out.println(a); //a를 출력
		}if(a < b) { // b가 a보다 크면
			System.out.println(b); //b를 출력
		}*/
		
		
		//3항 연산자 방법
		 System.out.println( (a>b)? a : b );
		 //(a>b)? a가 b보다 큰가?
		 //그러면 a 출력 아니면 b출력.
		}
	
}
