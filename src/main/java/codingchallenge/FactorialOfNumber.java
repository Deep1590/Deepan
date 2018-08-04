package codingchallenge;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=1,input;
		
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter number : ");
		input=scr.nextInt();

		
		for(int i1=input;i1>=1;i1--)
		{
			
			i=i*i1;
		}
		
		System.out.println(i);
	}

}
