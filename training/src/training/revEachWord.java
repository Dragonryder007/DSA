package training;

public class revEachWord {
	    public static String reverseEachWord(String str){
		    //Implement your code here and change the return value accordingly
	    	String word[]=str.split(" ");
	    	String rev="";
	    	for(int i=0; i<word.length; i++)
	    	{
	    		String w=word[i];
	    		String r="";
	    		for(int j=w.length()-1; j>=0; j--)
	    			r+=w.charAt(j);
	    		rev=rev+r+" ";
	    	}
	    	return rev;
		}
		
		public static void main(String args[]){
		    String str = "all cows eat grass";
		    System.out.println(reverseEachWord(str));
		}
	}
