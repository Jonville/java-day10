package sample01;

import java.util.Scanner;
import java.util.Vector;

public class Ex01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Vector<Integer> v = new Vector<Integer>();

		while (true) {

			int num = sc.nextInt();
			if (num == -1) {
				break;
			}

			v.add(num);	
			
		}
		
		int max = v.get(0);
		for(int i = 0 ; i < v.size(); i++) {
			
			System.out.println(v.get(i));
			
//			index = Math.max(max, v.get(i));
			if(max < v.get(i))
			{
				max = i;
			}
				
			
		}
		
//		System.out.println("최대값은 " + max);
		System.out.println("최대값은 " + v.get(max));


	}

}