package p_2_15;

public class Class_PrintApp_답 {

	public static void main(String[] args) {
		Class_Print_답 print = new Class_Print_답();
        
        print.printer(10);     //int
        print.printer(true);   //boolean
        print.printer(5.7);    //double
        print.printer("홍길동"); //String
        print.printer('a');    //char
        
    }

}
