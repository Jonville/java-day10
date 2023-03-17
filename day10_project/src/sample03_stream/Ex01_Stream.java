package sample03_stream;

import java.io.FileReader;
import java.io.IOException;

public class Ex01_Stream {

	public static void main(String[] args) {

		FileReader fin = null;
		
		try {
			fin = new FileReader("C:\\Windows\\system.ini");
			int c = 0;
			while((c = fin.read()) != -1) {	// 한문자씩 파일 끝까지 읽기	// -1은 빈값을 의미
				System.out.print((char)c);
			}
			
			fin.close();
		}catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}

}
