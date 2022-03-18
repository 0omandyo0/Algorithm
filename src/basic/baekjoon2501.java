package basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 약수 구하기 
// 백준 : https://www.acmicpc.net/problem/2501
public class baekjoon2501 {

	static List<Integer> measure = new ArrayList<>();
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		int count = sc.nextInt();
		
		for(int i = 1 ; i <= number; i++) {
			if(number % i == 0) {
				measure.add(i);
			}
		}
		
		if(measure.size() > count-1) {
			System.out.println(measure.get(count-1));			
		}else {
			System.out.println("0");
		}
	}

}
