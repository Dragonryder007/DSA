package training;

public class remove_spaces {
	    public static String removeWhiteSpaces(String str){
			//Implement your code here and change the return value accordingly
			String s=str.replaceAll("\\s", "");
			   
			
	        return s;
		}
		
		public static void main(String args[]){
			String str = "Hello   How are you   ";
			str = removeWhiteSpaces(str);
			System.out.println(str);
		}
	}

