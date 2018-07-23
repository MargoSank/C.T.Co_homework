import java.util.Stack;

public class Task3 {
	public static void main(String[] args) {
		
		String input ="{()}[[{}]]"; 
		char[] inputArray = input.toCharArray();
		boolean answer = search(inputArray);
		if(answer) {
			System.out.println("Ok");
		} else {
			System.out.println("Error");
		}		
	}
	private static Stack<Character> stack = new Stack<>();
	private static boolean search (char[] array) {
		for(int i=0; i<array.length;i++) {
			if(test(array[i])==false) {
				return false;
			}	
		}
		return true;
	}
	private static boolean test (char symbol) {
			if (symbol=='(' || symbol=='[' || symbol=='{') {
				stack.push(symbol);
				return true;
			}
			if (symbol==')') {
				if (stack.empty()) {
					return false;
				}
				if(stack.peek()=='(') {
					stack.pop();
					return true;
				}
			}
			if (symbol==']') {
				if (stack.empty()) {
					return false;
				}
				if(stack.peek()=='[') {
					stack.pop();
					return true;
				}
			}
			if (symbol=='}') {
				if (stack.empty()) {
					return false;
				}
				if(stack.peek()=='{') {
					stack.pop();
					return true;
				}
			}
	return false;
	}
}
