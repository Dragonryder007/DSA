package training;

import java.util.*;

public class KthMinEle {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		
		for(int i=0; i<n; i++) {
			ar[i]=sc.nextInt();
		}
		
		Arrays.sort(ar);
		
		int k=sc.nextInt();
		
		System.out.print(ar[k-1]);
		
		sc.close();
	}

}
