package training;

public class t2 {
	
	 public static double[] findDetails(double[] salary) {
	        //Implement your code here and change the return value accordingly
		 double[] d=new double[3];
		 double sum=0;
		 for(int i=0;i<salary.length;i++)
		 {
			 sum+=salary[i];
		 }
		 double avg_sum=sum/salary.length;
		 
		 int c=0,b=0;

		 for(int i=0;i<salary.length;i++)
		 {
			 if(salary[i]<avg_sum)
				 c++;
			 else if(salary[i]==avg_sum)
				 continue;
			 else
				 b++;
		 }
		 d[0]=avg_sum;
		 d[1]=b;
		 d[2]=c;
		 return d;

	    }
	       
	    public static void main(String[] args) {
	        double[] salary = { 23500.0, 25080.0, 28760.0, 22340.0, 19890.0 };
	        double[] details = findDetails(salary);
	              
	        System.out.println("Average salary: "+ details[0]);
	        System.out.println("Number of salaries greater than the average salary: "+ details[1]);
	        System.out.println("Number of salaries lesser than the average salary: "+ details[2]);
	    }

}
