package training;

public class Chick_and_Rab {
	public static void main(String[] args) {
		
		int c, r, h=150, l=500;
		c=1;
		r=h-c;
		while(true)
		{
			if(((r*4)+(c*2))==l)
			{
				System.out.println("Chickens="+c);
				System.out.println("Rabbits="+r);
				break;
			}
			else
			{
				c++;
				r--;
				if (r < 0)
				{
                    System.out.println("The input number is wrong");
                    break;
                }

			}
			
		}
	}

}
