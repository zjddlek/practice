package p_2_15;

public class practiceStatic1 {
	public static double PI = 3.14;
	
	public static int plus(int a, int b) {
		return a + b;
	}
	
	public static double plus(double a, double b) {
		return a + b;
	}
	
	public static double CircleArea(int radius) {
		return radius*radius*PI;
	}
	
	public static int minus(int a, int b) {
		int retVal = a - b;
		return retVal;
		//return a - b; <- 도 가능.
	}
	
	public static double minus(double a, double b) {
		return a - b;
	}
	
	public static int min(int i, int j) {
		int Val = i - j;
		if (Val < 0) { //만약 val이 0보다 작으면
			Val = Val * -1; //선생님이 추가한 부분.
		}
		return Val;
	}
	//4. 원의면적, 사각형의 면적, 삼각형의 면적, 사칙연산 ( + - * / )사용 
	//static으로 각각만들어서
	//4-1. 원의면적
//내가한거. 뭔지 1도모르겠다...	
//	public static double ca(int weight, int hight) {
//		return weight*hight*PI;
//	}
	
	//**선생님이한거
	//곱셈
	public static int multiple(int i, int j) {
		int retVal = i * j;
		return retVal;
	}
	//나눗셈
	public static double div(int i, int j) {
		double retVal = (double) i / j;
		return retVal;
	}
	//사각형의 넓이
	public static double rectArea(int w, int h) {
		return w * h;
	}
	//삼각형의 넓이
	public static double triArea(int w, int h) {
		double retVal = (double) w * h / 2;
		return retVal;
	}
	
}
