package codingchallenge;

import java.util.Scanner;

public class ReverseString {

	static String inputText;

	static int nameLength;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		reverse();

	}

	public static void reverse() {

		System.out.println("ENter the string");

		Scanner value=new Scanner(System.in);

		inputText=value.next();


		nameLength= inputText.length();

		char[] str=inputText.toCharArray();


		for(int i=(nameLength-1);i>=0;i--)
		{
			System.out.println(str[i]);
		}
	}

}





