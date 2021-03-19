package p_2_15;

// 지금까지한거 main메소드 안에 다 가능
// 근데 그렇게 하면 main이 너무 길어짐.
// sum함수 재사용하기 위해서 메소드 따로 빼준거.

public class testVariavles_변수부터시작 {

	public static void main(String[] args) {
		double a = 10;
		double b = 5;
		
		// 1. 두 변수 a와 b를 합산하여 출력.
		//맞는 답 -> System.out.println(a + b);
		
		// 2.두 변수 a와 b를 합산하는 메소드 sum을 이용하여 출력하세요.
		// 내가한거. 자리 잘못잡음. main메소드 안에 만들었음.
        // int sum = 0;
		// sum = a + b;
		// System.out.println(sum);

		double c = 0;
		c = sum(a, b);
		System.out.println(c);
		// System.out.println( sum(a, b) );로도 같은 결과 나옴.
		
		// 3.두 변수 a와 b를 나눗셈하여 출력하세요.
		System.out.println(a / b);
		// 3-1.두 변수 b와 a를 나눗셈하여 출력하세요.
		System.out.println(b / a); 
		// int로 계산할 경우 정수값으로 계산되어 소숫점자리 삭제.
		System.out.println( (double)b / a); 
		// b를 double(실수)로 계산 b = 5.0
		// 애초에 int a = 10;
		// int b = 5;
		// int c = 0; 으로 해도 됨.
		// 대신에 아래쪽 sum메소드자리에 double로 되어있는거
		// int로 변경해야됨
		
		int ivar = 10;
		int ivar2 = 5;
		System.out.println(sum(ivar, ivar2 ));
		//sum 2번 메소드 호출한것.
		
		System.out.println(sum(ivar, b )); 
		//로 되어있으면 double형으로 출력됨.
		//sum 1번 메소드 호출함.
	}
	
	// 2.두 변수 a와 b를 합산하는 메소드 sum을 이용하여 출력하세요.
	// 선생님이 한거. 위에있는 a,b값이랑 다르다. 이 메소드에서는 main의 a,b를 알 수 없다.
	// 메소드 sum 1
	static double sum(double c, double d) { 
		// static 정적인, 어디서든 호출가능, 클래스 로딩되는 순간 만들어짐.  
		// static변수 -> 객체가 되기전에 사용가능.
		// 하나의 공간을 같은 클래스가 사용함.
		double sum = 0;
		sum = c + d;
		return sum;
		//return sum = sum을 호출한 놈에게 돌려줘.
	}
	// 메소드 sum 2
	static int sum(int c, int d) {
		int sum = 0;
		sum = c + d;
		return sum;
	}
	/*static void sum(double c, double d) {
		double sum = 0;
		sum = c + d;
		System.out.println(sum) 이라고 지정하면
		main메소드에 System.out.println(sum(ivar, b ));이렇게 쓰는게 아니라
		sum(ivar, ivar2);라고 쓰기만하면 답 나옴.*/

}
