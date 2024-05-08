package assignment;
import java.util.Scanner;

public class Reversestring {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter a string
	        System.out.println("Enter a string: ");
	        String inputString = scanner.nextLine();
	        String output = " ";
	        int i;
	        for (  i = inputString.length()-1; i>=0; i--)
	        	output = output + inputString.charAt(i);
	        System.out.println("Output reversed string is: " + output);
	}
	}
	        	