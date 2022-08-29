package training;

public class Str_palindrome {
	    public static boolean checkPalindrome(String str){
		    //Implement your code here and change the return value accordingly
		    String s="";
		    for(int i=str.length()-1; i>=0; i--)
		    {
		       s=s+str.charAt(i);		        	
		    }
		    if(str.equals(s))
		    	return true;
	        return false;
		}
		
		public static void main(String args[]){
			String str = "radar";
			if(checkPalindrome(str))
				System.out.println("The string is a palindrome!");
			else
				System.out.println("The string is not a palindrome!");
		}
	}

