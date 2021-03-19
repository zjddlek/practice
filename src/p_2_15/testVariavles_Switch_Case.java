package p_2_15;

public class testVariavles_Switch_Case {
	
	//Switch_Case는 case에 적힌것만 가능 짧은것 하기에 좋다. 
	//복잡한건 if문으로 작성
	public static void main(String[] args) {
		int a = 4;
		
		switch(a) { //a가
		case 1 : //1에 해당한다면
			System.out.println("양수1");
			break;
		case 2 : //2에 해당한다면
			System.out.println("양수2");
			break; 
		case 3 : //3에 해당한다면
			System.out.println("양수3");
			break;
		case 4 : //4에 해당한다면
			System.out.println("양수4");
			break;
		case 5 : //5에 해당한다면
			System.out.println("양수5");
			break;
		case 0 : //0에 해당한다면
			System.out.println("0");
			break;
		case -1 : //-1에 해당한다면
			System.out.println("음수");
			break;
		
		/*	switch(a) {
		 	case 1 :
			case 2 :
			case 3 :
			case 4 :
			case 5 :
			System.out.println("양수5");
			break; }
			브레이크 없으면 브레이크 만날때까지 돈다.
			
			switch(a) {
		 	case 1 : case 2 : case 3 : case 4 :
			case 5 :
			System.out.println("양수5");
			break; } 이런식으로도 가능*/
		}
		}
	
}
