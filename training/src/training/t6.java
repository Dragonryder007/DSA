package training;

public class t6 {
	public static void main(String[] args)
	{
		int a, num=2250, rem, sum=0;
		
		a=num;
		while(a!=0)
		{
			rem=a%10;
			sum+=rem;
			a=a/10;
		}
		if(num%sum==0)
			System.out.println(num+" is divisible by sum of its digits");
		else
			System.out.println(num+" is not divisible by sum of its digits");
	}
	

}
