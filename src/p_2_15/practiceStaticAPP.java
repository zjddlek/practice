package p_2_15;

public class practiceStaticAPP {
	public static void main(String[] args) {
		System.out.println("<1번문제>");
	  //1. 원 넓이 구하는 메소드 사용하여 반지름이 6인 원의넓이 구하기
		System.out.println(practiceStatic1.CircleArea(6));
		
		System.out.println("<2번문제>");
	  //2. 두 값의 차를 구하는 메소드를 만들고 호출하여 결과를 출력
		System.out.println(practiceStatic1.minus(5,4));
		System.out.println(practiceStatic1.minus(123,456));
		
		System.out.println("<3번문제>");
	  //3. 두 값의 차를 구하는 메소드를 만들고 호출하여 결과를 출력(절대값으로 = -값 나오면안됨)
		System.out.println(practiceStatic1.min(123, 456));
		
		
		System.out.println("<4번문제>");
		//4.원의면적, 사각형의 면적, 삼각형의 면적, 사칙연산 ( + - * / )사용 
		//static으로 각각만들어서
		//나는 못풀음.. 문제이해 못함.
		//선생님이 풀이한거
		System.out.println(practiceStatic1.multiple(2, 3));
		System.out.println(practiceStatic1.div(5, 8));
		System.out.println(practiceStatic1.rectArea(123, 456));
		System.out.println(practiceStatic1.triArea(741, 963));

}
}
