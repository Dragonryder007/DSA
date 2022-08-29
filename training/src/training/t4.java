package training;

public class t4 {

		public static int[] findNumbers(int num1, int num2) {
			int[] numbers = new int[6];
			int c=0;

			// Implement your code here
			if(num1<=num2)
			{				
				for(int i=num1++;i<=num2; i++)
				{
					if((i>=10)&&(i<=99))					
					{
							if((i%3==0)&&(i%5==0))
							{
								if(c<6)
								{
									numbers[c++]=i;
								}
							}
					}
				}
			}
							
			return numbers;
		}

		public static void main(String[] args) {
			int num1 = -10;
			int num2 = 200;

			int[] numbers = findNumbers(num1, num2);
			if (numbers[0] == 0) {
				System.out.println("There is no such number!");
			} else {
				for (int index = 0; index <= numbers.length - 1; index++) {
					if (numbers[index] == 0) {
						break;
					}
					System.out.println(numbers[index]);
				}
			}

		}
}
