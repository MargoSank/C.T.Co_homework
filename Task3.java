import java.util.Stack;

public class Task3 {
	public static void main(String[] args) {
		String input ="}()()(][)}";
		char[] inputArray = input.toCharArray();
		boolean answer = search(inputArray);
		if(answer) {
			System.out.println("Ok");
		} else {
			System.out.println("Error");
		}		
	}
	public static Stack<Character> stack = new Stack<>();
	public static boolean search (char[] array) {
		for(int i=0; i<array.length;i++) {
			if(proverka(array[i])==false) {
				return false;
			}	
		}
		return true;
	}
	public static boolean proverka (char simbol) {
			if (simbol=='(' || simbol=='[' || simbol=='{') {
				stack.push(simbol);
				return true;
			}
			
			if (simbol==')') {
				if (stack.empty()) {
					return false;
				}
				if(stack.peek()=='(') {
					stack.pop();
					return true;
				}
			}
			if (simbol==']') {
				if (stack.empty()) {
					return false;
				}
				if(stack.peek()=='[') {
					stack.pop();
					return true;
				}
			}
			if (simbol=='}') {
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
