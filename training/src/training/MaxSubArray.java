 package training;
 
 import java.util.*;

public class MaxSubArray {
	
	public static int maxArr(int[] a) {
		
		int curSum=a[0];
		int max=a[0];
		
		if(a.length==1)
			return a[0];
		for(int i=1; i<a.length; i++) {
			curSum=Math.max(a[i], curSum+a[i]);
			max=Math.max(max, curSum);
		}
		
		return max;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[] = new int[n];
		
		for(int i=0; i<n; i++) {
			a[i]=sc.nextInt();
		}
		
		int res = maxArr(a);
		
		System.out.print(res);
		
		sc.close();

	}

}
