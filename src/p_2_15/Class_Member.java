package p_2_15;

public class Class_Member {
	private String ID;
	private String name;
	private int point;
	
	public String getID() {
		return ID;
		//get에서 바로 출력하는방법
		//public String getID() {
		//System.out.println(ID);
		//return ID;}
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	public Class_Member(String iD, String name, int point) {
		super();
		ID = iD;
		this.name = name;
		this.point = point;
	}
	
	public Class_Member() {
	}
	
	public void status() {
		System.out.println(" ====== 회원정보 ======");
	    System.out.println("회원 ID : " + ID);
	    System.out.println("회원 이름 : " + this.name);
	    System.out.println("회원 point : " + this.point + "점 입니다.");  
	}
	/*선생님이 한거
	 	public Member(String iD, String name, int point) {
		super();
		ID = iD;
		this.name = name;
		this.point = point;
	      }
	
		public Member() {
		}샘은 using fields 안만들음.
		
		public void status() {
		System.out.println(" ====== 회원정보 ======");
	    System.out.println("회원 ID : " + getID());
	    System.out.println("회원 이름 : " + this.setName());
	    System.out.println("회원 point : " + this.getPoint() + "점 입니다.");  
	}*/

}
