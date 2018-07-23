
public class Task1 {

	public static void main(String[] args) {
		
		 int[] input = {1,3,1,2,4,2,2,2,5,6,6,6,6,7};
		 int max = -1;
		 int count = 1;
		 int number = -1;
		 for(int i=0;i<input.length-1;i++) {
			 if(input[i] == input[i+1]) {
				 count++;							 
				 if(max < count) {			
					 max=count;
					 number = input[i];
				}
			} else {	
				count = 1;
			}
		}
		 System.out.println("Correct number is "+number);
	}
}


