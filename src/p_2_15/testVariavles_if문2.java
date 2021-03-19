package p_2_15;

public class testVariavles_if문2 {

	public static void main(String[] args) {
		int a = 10;
		int b = 15;
		
		//변수 a값이 양수이면 "양수" 음수이면 "음수" 0이면 "0"으로 출력
		if (a > 0){ // 만약 a가 0보다 큰가?
			System.out.println("양수");
			
		}else if(a < 0) { //그렇지 않으면 a가 0보다 작은가?
			System.out.println("음수");
			
		}else { //그것두 아니면
			System.out.println("0"); //0이라고 출력해
		}
		
		/*if (a > 0){ //혹시 a가 0보다 큰가?
			System.out.println("양수");
			
		}
		if(a < 0) { //혹시 a가 0보다 작은가?
			System.out.println("음수");
			
		}
		if( a == 0 ) { //혹시 a는 0인가?
			System.out.println("0");
			
		3항 연산자로는 음수 양수 판별까지 밖에 안된다.*/
		
		}
	
}
