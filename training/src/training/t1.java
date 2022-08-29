package training;

class Teacher{
	private String tname;
	private String tsub;
	private double tsal;
	
	public Teacher(String tname, String tsub, Double tsal) {
		 this.tname = tname;
	     this.tsub = tsub;
	     this.tsal = tsal;
	}
	
	public String get_tname() {
		return tname;
	}
	
	public void set_tname(String tname) {
		this.tname = tname;
	}
	
	public String get_tsub() {
		return tsub;
	}
	
	public void set_tsub(String tsub) {
		this.tsub = tsub;
	}
	
	public double get_tsal() {
		return tsal;
	}
	
	public void set_tsal(Double tsal) {
		this.tsal = tsal;
	}
}

public class t1 {
	public static void main(String[] args) {
		Teacher ta[]=new Teacher[4];
		ta[0]=new Teacher("Alex","Java Fundamentals",1200d);
		ta[1]=new Teacher("John","RDBMS",800d);
		ta[2]=new Teacher("Sam","Networking",900d);
		ta[3]=new Teacher("Maria","Python",900d);
		
		for(int i = 0; i<ta.length; ++i) {
			System.out.print("Name: "+ta[i].get_tname());
		    System.out.print(", Subject: "+ta[i].get_tsub());
		    System.out.println(", Salary: "+ta[i].get_tsal());
	      }
	}
}


