package p_2_15;

public class Class_Base_답 {
	public void service(String state) { //이부분은 선생님이 풀어줌.
		// 코드작성
		if (state == "낮" || state.equals("낮") || "낮".equals(state)) {
			//3개 다 맞지만 제일 정확한건 "낮".equals(state) 이부분. 이걸로 대다수 해결가능
			day(); 
		}
		if ("밤".equals(state)) { //만약 "밤"이 state와 같다면
			night();   //아래 public void night() 출력
		}
		if ("오후".equals(state)) { //만약 "오후"가 state와 같다면
			afternoon(); //아래 public void afternoon() 출력
		}
	}

	public void day() {
		System.out.println("낮에는 열심히 일하자");
	}

	public void night() { //이것만 내가함.
		System.out.println("night");
	}

	public void afternoon() {
		System.out.println("오후도 낮과 마찬가지로 일해야 합니다.");
	}
}
