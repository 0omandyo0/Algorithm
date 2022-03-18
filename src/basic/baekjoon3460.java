package basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class baekjoon3460 {

	static List<Integer> inputData = new ArrayList<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		sc.nextLine();

		for (int i = 0; i < n; i++) {
			inputData.add(sc.nextInt());
			sc.nextLine();
		}

		for (int i = 0; i < inputData.size(); i++) {
			
			List<Integer> result = new ArrayList<>();

			String str = "";

			int number = inputData.get(i);
//			String output = "";
			while (number > 0) {
				result.add(number % 2);
				number = number / 2;
			}
			
			for(int j = 0 ; j < result.size(); j++) {

				if(result.get(j) == 1) {
					str += j + " ";
				}
			}
			
			System.out.println(str);
		}
	}

}
