package week1.day2;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number[]= {22,32,42,122,-9};
		
		int largest = number[0];
		 
        for (int i = 1; i < 5; i++) 
        {
		if (largest < number[i])
			largest = number[i];
	}
		
        System.out.println("Largest of given numbers is " + largest);
	}

}
