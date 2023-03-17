package sample03_stream;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex02_Stream {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FileWriter fout = null;
		int c;
		try {
			fout = new FileWriter("D:\\test.txt");
			while (true) {
				String line = scanner.nextLine();
				if (line.length() == 0)
					break;
				fout.write(line, 0, line.length());		// 0번째 부터 length 까지 ~ 라는 뜻
				fout.write("\r\n", 0, 2);		// 줄바꿈 으로 처리해준다는 뜻
			}
			fout.close();
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
		scanner.close();
	}
}