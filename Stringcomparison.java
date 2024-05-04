package assignment;
import java.util.Arrays;

public class Stringcomparison {

	
		public static void main(String[] args) {
	        // Two strings to compare
	        String str1 = "AVIK";
	        String str2 = "AVIK";

	        String[] arr1 = new String[5];
	        String[] arr2 = new String[4];

	        // Compare using Arrays.equals() method
	        if (Arrays.equals(arr1, arr2)== true) {
	            System.out.println("The strings are equal.");
	        } else {
	            System.out.println("The strings are not equal.");
	        }
	    }
	}