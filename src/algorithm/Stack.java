package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://st-lab.tistory.com/175
// 스택 사용법 : https://yongku.tistory.com/entry/%EC%9E%90%EB%B0%94Java-%EC%8A%A4%ED%83%9DStack-%ED%81%B4%EB%9E%98%EC%8A%A4-%EB%B0%8F-%EC%98%88%EC%A0%9C

public class Stack {

	static int count;
	static java.util.Stack<Integer> stack = new java.util.Stack<>();
	static String result = "";
	
	public static void main(String[] args) throws IOException {
	
		// sccaner 사용시 시간초과 에러 발생
		// bufferedReader, StringTokenizer 로 대체 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		count = Integer.parseInt(br.readLine());
		
		StringTokenizer st = null;
		
		for(int i = 0; i < count ; i++) {
			

			st = new StringTokenizer(br.readLine(), " ");
			
			switch(st.nextToken()) {
			case "push" : 
				stack.push(Integer.parseInt(st.nextToken())); 
				break;
			case "pop" : 
				if(stack.isEmpty()) result += (-1 + "\n") ; 
				else result += (stack.pop() + "\n") ; 
				break;
			case "size" : 
				result += (stack.size() + "\n"); 
				break;
			case "empty" : 
				if(stack.isEmpty()) result += (1 + "\n") ; 
				else result += (0 + "\n"); 
				break;
			case "top" : 
				if(stack.isEmpty()) result +=(-1 + "\n") ; 
				else result += (stack.peek() + "\n"); 
				break;
			default: System.out.println("잘못된 입력입니다.");
			}
		}
		System.out.println(result);

	}
	
}
