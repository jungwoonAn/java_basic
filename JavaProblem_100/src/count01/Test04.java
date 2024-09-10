package count01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Test04 {

	public static void main(String[] args) {
		// 파일 읽기/쓰기
		try(BufferedWriter writer = new BufferedWriter(new FileWriter("test.txt"))) {
			writer.write("Hello, World!");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
