package testing;

import java.util.Stack;

public class WellFormedString {

	public static void main(String[] args) {
		String str="{]}";
		Stack<Character> st=new Stack<>();
		for (int i=0;i<str.length();i++) {
			char each=str.charAt(i);
			if (st.empty()) {
				st.push(each);
			}
			else if (each=='{'|| each=='('|| each=='[' ) {
				st.push(each);
			}
			else if(each=='}' && st.peek()=='{') {
				st.pop();
			}
			else if(each==')' && st.peek()=='(') {
				st.pop();
			}
			else if(each==']' && st.peek()=='[') {
				st.pop();
			}
		}
		if (st.empty()) {
			System.out.println("Well formed");
		}
		else {
			System.out.println("not well formed");
		}
		System.out.println(st);
	}

}
