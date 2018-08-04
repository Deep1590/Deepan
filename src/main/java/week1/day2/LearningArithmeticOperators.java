package week1.day2;

public class LearningArithmeticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numberOne=5,numberTwo=6;
		
		CallingArithmeticOperators accessoperators = new CallingArithmeticOperators();
		
		accessoperators.operations(numberOne, numberTwo);
		
		
}


}

 class CallingArithmeticOperators {

	public void operations(int a ,int b) {
		// TODO Auto-generated method stub
		

		
		System.out.println("Sum Of Two numbers is "+ (a+b));
		System.out.println("Difference Of Two numbers is "+ (a-b));
		System.out.println("Product Of Two numbers is "+ (a*b));
		System.out.println("Quotient Of Two numbers is "+ (a/b));
		System.out.println("Reminder Of Two numbers is "+ (a%b));

	}
}