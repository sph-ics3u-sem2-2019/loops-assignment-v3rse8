package problem1;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// Read a value. Print out from 1 to the input
		Scanner in=new Scanner(System.in);
		
		System.out.println("Give me a number");
		int x=in.nextInt();
		int y=1;
		
		while (y <= x) {
			System.out.println(y);
			y = y + 1;
		}
		
	}

}
