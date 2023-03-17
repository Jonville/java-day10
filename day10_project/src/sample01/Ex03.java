package sample01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<Integer>();

		while (true) {
			System.out.println("강수량을 입력하세요.");
			int rainfall = sc.nextInt();
			if (rainfall == -1) {
				break;
			}
			al.add(rainfall);
		}

		Iterator<Integer> iter = al.iterator();
		
		int sum = 0;

		while (iter.hasNext()) {
			Integer n = iter.next();
			sum += n;
		}

		System.out.println("총 강수량은 : " + sum);
		System.out.println("총 강수량의 평균은 : " + (double) sum / al.size());

	}

}
