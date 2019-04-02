package problem4;
import java.util.Scanner;
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		// Ask the user 10 multiplication questions. Check their answers and
		//give them their score
		//get 2 random numbers from 1 to 10 and display them as a multiplication question
		//get the answer of those numbers and set it as a variable
		Random rnd=new Random();
		Scanner in=new Scanner(System.in);
		int questions = 0;
		int ans1 = 0;
		int ans2 = 0;
		int points = 0;
		
		
		System.out.println("Here are your questions");
		
		while (questions<10) {
			int num1 = rnd.nextInt(10-0+1)+0;
			int num2 = rnd.nextInt(10-0+1)+0;
			System.out.println(num1 + " x " + num2);
			ans1 = in.nextInt();
			ans2 = num1 * num2;
					if (ans1 == ans2) {
						System.out.println("Correct!"
								+ " "
								+ "");
						points = points + 1;
					} else {
						System.out.println("Wrong!"
								+ " "
								+ "");
					}
			
			questions = questions + 1;
		}
		
		System.out.println("You got a score of " + points + "/10");
		
	}

}
