package p_2_15;

public class MyMath_Static연습 {
	public static double PI = 3.14;
	// 메소드에서는 this사용불가. 
	//this는 현재 객체라는 뜻이라서 사용불가.
	//static은 객체가 되기전에 사용가능함.
	//static 메소드에서는 static멤버만접근가능
	//객체 만들기 => MyMath m = new MyMath();
	//static에서는 객체를 만들 필요 없다.
	
	public static int plus(int a, int b) {
		return a + b;
	}
	public static double plus(double a, double b) {
		return a + b;
	}
	public static double CircleArea(int radius) {
		return radius*radius*PI;
	}

}
