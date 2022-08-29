package training;

public class move_spcl_char{
    
    public static String moveSpecialCharacters(String str){
		//Implement your code here and change the return value accordingly
    	String regx = "[a-zA-Z0-9\\s+]";
    	String r1="", r2="";
    	for(int i=0; i<str.length(); i++)
    	{
    		char c=str.charAt(i);
    		if(String.valueOf(c).matches(regx))
    		{
    			r1=r1+c;
    		}
    		else
    			r2=r2+c;
    	}
        return r1+r2;
	}
	
	public static void main(String args[]){
	    String str = "He@#$llo!*&";
	    System.out.println(moveSpecialCharacters(str));
	}
	
}
