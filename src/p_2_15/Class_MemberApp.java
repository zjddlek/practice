package p_2_15;

import java.util.Scanner;

public class Class_MemberApp {

	public static void main(String[] args) {
		Class_Member m = new Class_Member("태민사랑123456", "이태민", 665);
		
		 m.status();
		
		 m.setID("1만번 사랑해");
		 m.setName("누구야");
		 m.setPoint(5555);
		 m.status();
		 //두가지 방법으로 가능.
		 
		 System.out.println( "===================" );
		//get쓰는방법
		 m.getID(); //<-이것만 쓰면 아무것도 출력안됨
		 System.out.println( m.getID() ); //<-이렇게 해야 출력됨		 
		 
		 System.out.println( "===================" );
		 
		 String s = m.getID(); 
		 System.out.println( "s : " + s ); 
		 
		 //System.out.println( "ID: " + m.id ); 
		 //이렇게 하면 바깥ㅇㅔ서는 이 id에 직접 접근 불가하기 때문에 에러남.
		 //class에서만 접근가능.
		 
		
	}

}
