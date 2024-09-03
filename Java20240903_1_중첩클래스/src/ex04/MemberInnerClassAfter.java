package ex04;

class Network {
	public void message(String content) {
		SendMessage message = new SendMessage(content);
		System.out.println(message.getMsg());
	}
	
	class SendMessage {  // Network에서만 이용하는 클래스는 내부클래스로 선언
		private String msg;

		public SendMessage(String msg) {
			this.msg = msg;
		}
		
		String getMsg() {
			return msg;
		}
		
	}
}

public class MemberInnerClassAfter {

	public static void main(String[] args) {
		
		Network network = new Network();  // Network객체만 생성
		network.message("이 문장을 전송해 주세요~!");
	}

}
