package week1.day2;

import java.util.Scanner;

public class StudentsDataUsingForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] studentsList = {"Deepan","Abi","Ram","Ganesh","Vignesh"};
		int [] ageOfStudents = {25,24,25,26,24};
		char[][] gradeOfStudents =
			{ 
					{'A','B','B','A','B'},
					{'A','A','A','A','D'},
					{'A','B','C','F','D'},
					{'A','B','C','D','D'},
					{'A','B','C','B','D'}
			};

		for(int index=0;index<5;index++)
		{

		System.out.println(studentsList[index] + " who is " + ageOfStudents[index]
				+" years old scored " + gradeOfStudents[index][0] + ','
				+ gradeOfStudents[index][1] + ','
				+ gradeOfStudents[index][2] + ','
				+ gradeOfStudents[index][3] + ','
				+ gradeOfStudents[index][4] );
		}
	}

}
