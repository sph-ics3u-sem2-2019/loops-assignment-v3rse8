package problem3;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// Read in a word and print out one character per String
		// 
		Scanner sc=new Scanner(System.in);
		
		
		
		System.out.println("Type a word");
		String word = sc.nextLine();
		int l = word.length();
		int letter = 0;
			
		
		while (l > 0) {
			char w = word.charAt(letter);
			
			System.out.println(w);
			
			l = l - 1;
			letter = letter + 1;
		}
			
			
		
	}

}
