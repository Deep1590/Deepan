package codingchallenge;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		int multiplier,endValue;
		Scanner value = new Scanner(System.in);


		System.out.println("Enter the multiplier");

		multiplier=value.nextInt();

		System.out.println("Enter the range till table should be printed");
		endValue=value.nextInt();




		for (int i=1;i<=endValue;i++)
		{
			int multipliedValue=i*multiplier;
			System.out.println(i + " * " + multiplier + " = "+ multipliedValue);
		}

	}

}
