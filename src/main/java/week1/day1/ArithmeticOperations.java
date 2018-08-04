package week1.day1;

public class ArithmeticOperations {

	int numberOne=10;
	int numberTwo=5;

	public void addition()
	{
		System.out.println(numberOne+numberTwo);
	}
	public int subtract()
	{
		System.out.println(numberOne-numberTwo);
		//why we need to add return
		return 0;		
	}
	public void multiply()
	{
		System.out.println(numberOne*numberTwo);		
	}
	public void multiplyNumberOneByTwo()
	{
		System.out.println(numberOne*numberTwo);		
	}
	public int divideNumberTwo(int divident)
	{

		System.out.println(numberTwo/divident);
		return 0;		
	}
}
