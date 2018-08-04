package week1.day2;

import java.util.Scanner;

public class TestCaseStatus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String testResultsValue[]= {"Passed","Failed","Blocked","Invalid"};
		
		System.out.println("Enter the status of the test cases");
		Scanner input = new Scanner(System.in);
		String status = input.next();
		
		
	
		switch(status)
		{
		case "Passed":
		
		System.out.println("test case is passed");
		
		break;
		
		case "Failed":
			
			System.out.println("test case is failed");
			
			break;
			
		case "Blocked":
			
			System.out.println("test case is blocked");
			
			break;
			
		case "Invalid":
			
			System.out.println("test case is Invalid");
			
			break;
			
		
		}

	}

}
