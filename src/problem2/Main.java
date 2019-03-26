package problem2;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// Read in two numbers. Add up all the values between them
		//take the first number and the second number, add 1 to the first number, and add that number to the total.
		//for every time that x is not equal to y you keep looping but dont print a lin
		Scanner in=new Scanner(System.in);
		
		System.out.println("What is the first number?");
		int x = in.nextInt();
		System.out.println("What is the second number?");
		int y = in.nextInt();
		int total = 0;
		
		for (int ctr=x;ctr<=y;ctr++) {
			total=total+ctr;
		}
		
		
		System.out.println(total);
	}

}
