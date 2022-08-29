package training;

public class t5 {
	public static void main(String[] args)
	{	
		int rem, num, a=63736, sum=0;
	
		num=a;
		while(num!=0)
		{
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		if(sum==a)
		{
			System.out.println(a+" is a palindrome");
		}
		else
		{
			System.out.println(a+" is not a palindrome");
		}
	}
}
