package p_2_15;

public class Class_Print_답 {
	   public void printer(int val){
	        System.out.println(val);
	    }
	   //메소드 작성.
	   public void printer(boolean val){
	        System.out.println(val);
	    }
	   public void printer(double val){
	        System.out.println(val);
	    }
	   public void printer(String val){
	        System.out.println(val);
	    }
	   //메소드 오버로딩
	   //인자값의 타입에 ㄸㅏ라 찾아간다.
	   public void printer(char val){
	        System.out.println(val);
	    } //이거 안하면 아스키 코드 값 나옴.
	   
	
}