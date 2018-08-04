package week1.day1;

public class OddEvenPrime {

	public static void main(String[] args) {

		int num=5,count=0;

		for(int i=2;i<=num/2;i++)
		
			{
				// condition for nonprime number
				if(num%i==0)
				{
					count=1;
					break;
				}
				
			}
		
			if (count==0)
			{
				if (num%2==0)
				{
					System.out.println(num + " is a prime even number.");
				}
				else
				{
					System.out.println(num + " is a prime odd number.");
				}
			}
			else
			{
				if (num%2==0)
				{
					System.out.println(num + "  is not a prime but a even number.");
				}
				else
				{
					System.out.println(num + "  is not a prime but a odd number.");
				}
			
				
			}
		}

	}

	// TODO Auto-generated method stub


