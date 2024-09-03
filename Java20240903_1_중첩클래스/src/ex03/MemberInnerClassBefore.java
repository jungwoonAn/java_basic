package ex03;

class SendMessage {  // 일반 클래스 - 외부에 노출되어 있음
	private String msg;

	public SendMessage(String msg) {
		this.msg = msg;
	}
	
	String getMsg() {
		return msg;
	}
	
}

class Network {
	public void message(String content) {
		SendMessage message = new SendMessage(content);
		System.out.println(message.getMsg());
	}
}

public class MemberInnerClassBefore {

	public static void main(String[] args) {
		
		Network network = new Network();  // Network객체만 생성
		network.message("이 문장을 전송해 주세요~!");
	}

}
