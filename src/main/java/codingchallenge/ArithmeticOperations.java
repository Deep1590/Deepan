package codingchallenge;

import java.util.Scanner;

public class ArithmeticOperations {

	static int numberOne;
	static int numberTwo;
	
	static String input;

	public static void main(String[] args)
	{
	
		Scanner value = new Scanner(System.in);


		System.out.println("Enter the number one");

		numberOne=value.nextInt();
		
		Scanner value1 = new Scanner(System.in);


		System.out.println("Enter the number two");

		numberTwo=value1.nextInt();
		
		Scanner value2 = new Scanner(System.in);


		System.out.println("Enter the operator");

		input=value2.next();
	
	switch(input)
	{
	
	case "addition":
	
		System.out.println(numberOne+numberTwo);
	
		break;
	case "subtract":
	
		System.out.println(numberOne-numberTwo);
		//why we need to add return
			
		break;
	case "multiply" :
	
		System.out.println(numberOne*numberTwo);		
		break;
		
	
	case "Divide" :
	

		System.out.println(numberOne/numberTwo);
		break;
	}
	}
}
