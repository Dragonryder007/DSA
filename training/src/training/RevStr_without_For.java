package training;

public class RevStr_without_For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a= "appa";
		String s="";
		StringBuilder sb=new StringBuilder(a);
		s=sb.reverse().toString();
		if(a.equals(s))
			System.out.println("True");
		else
			System.out.println("False");
		

	}

}
