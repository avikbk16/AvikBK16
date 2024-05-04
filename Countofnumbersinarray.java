package assignment;

public class Countofnumbersinarray {

	public static void main(String[] args) {
		
		 int[] arr = {11, 22, 33, 11, 66, 11};
	        int target = 11;
	        int count = countOccurrences(arr, target);
	        System.out.println("The number of occurrences of " + target + " is: " + count);
	    }

	    public static int countOccurrences(int[] arr, int target) {
	        int count = 0;
	        for (int num : arr) {
	            if (num == target) {
	                count++;
	            }
	        }
	        return count;
	    }
	}