package codingchallenge;

import java.util.Scanner;

public class SumOfNumbersInArray {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int inputNumberIndex = 0;
		int sum=0;

		Scanner scr = new Scanner(System.in);

		System.out.print("Enter no. of elements you want in array:");

		inputNumberIndex = scr.nextInt();

		int inputNumber[] = new int[inputNumberIndex];

		System.out.println("Enter the input numbers ");

		for (int i=0;i<inputNumberIndex;i++)
		{

			inputNumber[i]=scr.nextInt();
			sum=inputNumber[i]+sum;
		}

		System.out.println("Sum of numbers in Array is " + sum);
	}

}
