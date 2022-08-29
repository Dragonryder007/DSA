package training;

import java.util.*;

public class two_sums {
	
	 public static int[] twoSum(int[] nums, int target) {
	        
		 int r[]=new int[2];
		 
		 for(int i=0; i<nums.length; i++) {
			 for(int j=i+1; j<nums.length; j++) {
				 if(nums[i]+nums[j]==target) {
					 r[0]=i;
                 	 r[1]=j;
                 	 return r;
				 }	 
			 }
		 }
		 
		 return new int[] {0,0};
		 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int res[]=new int[2];
		
		for(int i=0; i<n; i++)
		{
			a[i]=sc.nextInt();
		}
		
		int t=sc.nextInt();
		
		res=twoSum(a,t);
		for(int i=0; i<2; i++) {
			System.out.print(res[i]+" ");
		}
			
		
		sc.close();

	}

}
