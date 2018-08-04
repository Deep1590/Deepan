package week1.day2;

public class StudentsNameUsingForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] studentsList = {"Deepan","Abi","Ram","Ganesh","Vignesh"};
		int [] ageOfStudents = {25,24,25,26,24};
		
		for (String nameOfStudent:studentsList)
		{
			System.out.println(nameOfStudent + " has a name lenghth as" + nameOfStudent.length());
		}
		
		for (int age:ageOfStudents)
		{
			System.out.println(age);
		}
	}

}
