package codingchallenge;

public class SecondSmallestOfThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numberOne=5;
		int numberTwo=8;
		int numberThree=9;
		
		if((numberOne<numberTwo) &&(numberOne<numberThree))
		{
			System.out.println(numberOne +" is second smallest");
		}
		
		else
		{
			if ((numberTwo<numberOne)&&(numberTwo<numberThree))
			
			{
				System.out.println(numberTwo + " is second smallest");
			}
		
			else
				
				System.out.println(numberThree + " is second smallest");
			}
	}

}
