package codingchallenge;

import java.util.Scanner;

public class Ascending_Order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, temp;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int m = 0; m < n; m++) 
        {
            a[m] = s.nextInt();
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Ascending Order:");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(a[i] + "\n");
        }
        
        System.out.print("Descending Order:");
        for (int k = n-1; k >=0; k--) 
        {
            System.out.print(a[k] + "\n");
        }
        
	}

}
