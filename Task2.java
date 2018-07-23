import java.util.Scanner;
public class Task2 {

	public static void main(String[] args) {
		int input;
		int count;
		int level;
		Scanner user = new Scanner(System.in);
		System.out.print("Enter the number:");
		if (user.hasNextInt())
			input = user.nextInt();
		else {
			System.out.println("input error");
			user.close();
			return;
		}
		if(input%2==0){
			count = 2;
			level=input/2;
		} else {
			count = 1;
			level=(input+1)/2;
		}
		for(int i=1;i<=level;i++) {
			for(int n=level-i;n>0;n--) {
				System.out.print(" ");
			}
			for(int j=count;j>0;j--) {
				System.out.print("*");
			}
			count=count+2;
			System.out.println();
		}
	user.close();
	}
}
