package p_2_15;

public class MyMathApp_Static연습 {

	public static void main(String[] args) {
		
		MyMath_Static연습 m = new MyMath_Static연습();
		System.out.println(MyMath_Static연습.PI);
		MyMath_Static연습 n = new MyMath_Static연습();
		
		System.out.println(m.PI);
		m.PI = 3.13;
		System.out.println(m.PI);
		System.out.println(MyMath_Static연습.PI);
		System.out.println(n.PI);
		//PI의 값은 최종 변화시킨 값으로 공유됨.
		
		int i =  MyMath_Static연습.plus(1, 2);
		int j =  m.plus(1, 2);
		System.out.println("i-> "+i);
		System.out.println("j-> "+j);

	}

}
