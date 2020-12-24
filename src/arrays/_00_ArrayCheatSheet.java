package arrays;
import java.util.Random;

import javax.swing.JOptionPane;
public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda", "Tesla"};
		//2. print the third element in the array
		System.out.println(cars[3]);
		//3. set the third element to a different value
		cars[3] = "Opel";
		//4. print the third element again
		System.out.println(cars[3]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
		
		//6. make an array of 50 integers
		int[] nums = new int[50];
		for (int i = 0; i < nums.length; i++)
		    nums[i] = i + 1;
		//7. use a for loop to make every value of the integer array a random number
		int[] num = new int[100];
		Random rand = new Random();
		int n = rand.nextInt(50);
		n=+1;
		num[n] = n + 1;
		//8. without printing the entire array, print only the smallest number in the array
		System.out.println(num[0]);
		//9 print the entire array to see if step 8 was correct
		System.out.println(num);
		//10. print the largest number in the array.
		System.out.println(num[50]);
	
	}
}
