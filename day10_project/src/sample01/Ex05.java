package sample01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		HashMap<String, Integer> Info = new HashMap<String, Integer>();

		String name = "";
		Integer point = 0;

		int index = 0;

		while (true) {
			System.out.print("이름과 포인터 입력 >> ");
			name = sc.next();
			if (name.equals("그만")) {
				System.out.println("종료합니다.");
				break;
			}
			point = sc.nextInt();

			if (Info.containsKey(name)) {
				Info.put(name, Info.get(name) + point);
			} else {
				Info.put(name, point);
			}
			
			Set<String> keys = Info.keySet();
			Iterator<String> it = keys.iterator();
			while (it.hasNext()) {
				String key = it.next();
				int value = Info.get(key);
				System.out.print("(" + key + ", " + value + ") ");
			}
			System.out.println();

		}
	}

}
