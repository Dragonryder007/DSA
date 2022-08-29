package training;

public class armstrong_num {
	public static void main(String[] args) {
		
		int num=1634, p=0, rem, a, sum=0;
		
		a=num;
		
		while(a!=0)
		{
			rem=a%10;
			p++;
			a/=10;
		}
		
		a=num;
		while(a!=0)
		{
			rem=a%10;
			sum=(int) (sum+Math.pow(rem, p));
			a/=10;
		}
		
		if(sum==num)
			System.out.println(num+" is an Armstrong number");
		else
			System.out.println(num+" is not an Armstrong number");
	}

}
