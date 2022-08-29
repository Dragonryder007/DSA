package training;

public class t3 {
	
	 public static int[] findLeapYears(int year){
	       //Implement your code here and change the return value accordingly
		 int[] y=new int[15];
		 int c=0;
		while(c!=15)
		 {
			 if((year%4==0)&&(year%100!=0)||(year%400==0))
			 {
				 y[c]=year;
				 c++;
			 } 
			 year++;
		 }
			 
	        return y;
	   }
	    
	   public static void main(String[] args) {
	       int year = 1870;
		   int[] leapYears;
		   leapYears=findLeapYears(year);
		   for ( int index = 0; index<leapYears.length; index++ ) {
		       System.out.println(leapYears[index]);
		   }
	    }

}
