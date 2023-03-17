package sample02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MiniTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
		
		while(true) {
			HashMap<String, Object> map = new HashMap<String, Object>();
			
			System.out.println("입력 (이름, 수학, 영어) >> ");
		
			String name = sc.next();
			if(name.equals("그만")) {
				break;
			}
			
			map.put("name", name);
			map.put("math", sc.nextInt());
			map.put("eng", sc.nextInt());
			
			list.add(map);
		}
		
		for(int i = 0 ; i<list.size(); i++) {
			HashMap<String, Object> map = list.get(i);
			System.out.println("이름 : " + map.get("name"));
			System.out.println("수학 : " + map.get("math"));
			System.out.println("영어 : " + map.get("eng"));
		}

	}

}
