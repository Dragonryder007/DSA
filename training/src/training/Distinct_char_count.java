package training;

public class Distinct_char_count {
	public static void main(String args[]) {
		String str = "aaaabbbccd";
		char c[]=new char[str.length()];
		int count[]=new int[256];
		
		for(int i=0; i<str.length(); i++) {
			count[str.charAt(i)]++;
		}
		
		for(int i=0; i<str.length(); i++) {
			c[i]=str.charAt(i);
			int f=0;
			for(int j=0; j<=i; j++) {
				if(str.charAt(i)==c[j])
					f++;
			}
			if(f==1)
				System.out.println(str.charAt(i)+ " = " + count[str.charAt(i)]);
		}
	}

}
