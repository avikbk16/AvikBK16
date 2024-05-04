package assignment;
import java.util.*;

public class Arrayuserinput {

	public static void main(String[] args) {
        Scanner rv = new Scanner(System.in);

        // Asking the user for the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = rv.nextInt();

        // Declaring arrays to store name  ,marks,gender
        String[] names = new String[numStudents];
        int[] marks = new int[numStudents];
        char[] gender = new char[numStudents];

        // Taking input of names  marks,gender from the user
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter the name of student " + (i + 1) + ": ");
            names[i] = rv.next();
            System.out.println("Enter the marks of student " + (i + 1) + ": ");
            marks[i] = rv.nextInt();
            System.out.println("Enter the gender of student " + (i + 1) + ": ");
            gender[i] = rv.next().charAt(0);}
            System.out.println("name " +   "marks " +    "gender ");
            for (int i = 0; i < numStudents; i++) {
            	System.out.println( names[i]  + "     "+  marks[i]+  "     "     +   gender[i]);
            }
            rv.close();
        } } 