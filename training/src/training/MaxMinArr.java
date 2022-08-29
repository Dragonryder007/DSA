package training;

import java.util.*;

public class MaxMinArr {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		
		for(int i=0; i<n; i++) {
			ar[i]=sc.nextInt();
		}
		
		Arrays.sort(ar);
		
		int min=ar[0];
		int max=ar[ar.length-1];
		
		System.out.println("The Minimum Value is: "+min);
		System.out.println("The Minimum Value is: "+max);		
		
		sc.close();
		
	}

}
