
public class Task3 {
	
	public static void main(String[] args) {
		String input ="(())";
		char[] inputArray = input.toCharArray();
		int a = search(0,inputArray);
		if(a==-1) {
			System.out.println("error");
		} else {
			System.out.println("OK");
		}		
	}
	static int result=-1;
		
	public static int  search (int number, char [] array) {
		if(array[array.length-1]=='('|| array[array.length-1]=='{' || array[array.length-1]=='[')  {
			return -1;
		}	
		if(array[number]=='(') {
			   if (array[number+1]==')') {
				   return number+1;
			   } if (array[number+1]==']' || array[number+1]=='}') {
				   return -1;
			   } if (array[number+1]=='[' || array[number+1]=='{' || array[number+1]=='(') {
				   result = search(number+1,array);
				   if(result == -1) {
					   return -1;
				   } 
				   if(result+1<=array.length-1) {
				   		if (array[result+1]==')') {
				   			result = number+1;
				   			return result;
				   		}
				   }
			   } result = -1; 
		} 
		return result;
	}
}
