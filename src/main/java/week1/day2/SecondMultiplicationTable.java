package week1.day2;

import java.util.Scanner;

public class SecondMultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the range till table should be printed");
		
		int input;
		Scanner value = new Scanner(System.in);
		
		input=value.nextInt();
		
		for (int i=1;i<=input;i++)
		{
			int multipliedValue=i*2;
			System.out.println(i + "* 2 = "+ multipliedValue);
		}

	}

}
