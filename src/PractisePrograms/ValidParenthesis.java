package PractisePrograms;

import java.util.Stack;

public class ValidParenthesis {

	public static void main(String[] args) {
		String s = "[{{}}]";
		System.out.println(ValidParenthesis.checkValid(s));
	}
	
	public static boolean checkValid(String s) {
		if(s.isEmpty()) {
			return true;
		}
		char c[] = s.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		for(char x: c) {
			if(x=='(' || x=='{' || x=='[') {
				stack.push(x);
			}
			if(x==')') {
				if(stack.isEmpty() || stack.pop()!='(') {
					return false;
				}
			}
			if(x=='}') {
				if(stack.isEmpty() || stack.pop()!='{') {
					return false;
				}
			}
			if(x==']') {
				if(stack.isEmpty() || stack.pop()!='[') {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

}
