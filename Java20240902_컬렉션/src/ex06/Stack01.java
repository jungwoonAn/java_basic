package ex06;

import java.util.Stack;

public class Stack01 {
	public static void main(String[] args) {
		// Stack
		Stack<Integer> stack = new Stack<>();
		
		stack.push(10);
		stack.push(20);
		stack.add(60);
		stack.add(1,70);
		stack.push(30);
		
		System.out.printf("peek : %d, %d \n", stack.peek(), stack.pop());
		System.out.printf("peek : %d, %d \n", stack.peek(), stack.pop());
		System.out.printf("peek : %d, %d \n", stack.peek(), stack.pop());
		System.out.printf("peek : %d, %d \n", stack.peek(), stack.pop());
		System.out.printf("peek : %d, %d \n", stack.peek(), stack.pop());
							
	}
}