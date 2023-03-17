package sample01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		HashMap<String, Double> Info = new HashMap<String, Double>();

		String name = "";
		Double score = 0.0;

		for (int i = 0; i < 5; i++) {
			System.out.print("이름과 학점을 입력하세요 >> ");
			name = sc.next();
			score = sc.nextDouble();

			Info.put(name, score);

		}

		Set<String> keys = Info.keySet();

		Iterator<String> iter = keys.iterator();

		String getName = "";
		Double getScore = 0.0;

		System.out.print("장학생 선발 기준 점수 >> ");
		Double standard = sc.nextDouble();

		System.out.print("장학생 명단 >> ");

		while (iter.hasNext()) {
			getName = iter.next();
			getScore = Info.get(getName);

			if (getScore > standard) {
				System.out.print(getName + " ");
			}

		}

	}

}
