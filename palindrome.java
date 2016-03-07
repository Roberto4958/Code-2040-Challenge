
public class palindrome {

	public static Boolean isPalindrome(String input){
		int i = input.length();
		boolean skipi = false;
		boolean skipb = false;
		//int b= 0;
		for( int b=0; b<i;b++){
			
			//if(input.charAt(i-1)==' '||input.charAt(i-1)=='.'||input.charAt(i-1)=='!'||input.charAt(i-1)=='?'||input.charAt(i-1)==','){
			if(!Character.isLetterOrDigit(input.charAt(i-1))){
				i--;
				skipi=true;
			}
	       // if(input.charAt(b)==' '||input.charAt(b)=='.'||input.charAt(b)=='!'||input.charAt(b)=='?' ||input.charAt(b)==','){
			if(!Character.isLetterOrDigit(input.charAt(b))){
	        	b++;
	        	skipb =true;
	        }
			//if(!(input.substring(i-1, i).equals(input.substring(b,b+1)))){
	       // System.out.println(Character.toLowerCase(input.charAt(i-1)) +", "+ Character.toLowerCase(input.charAt(b)));
			if(Character.toLowerCase(input.charAt(i-1)) != Character.toLowerCase(input.charAt(b))){
			if(skipi&&skipb){
				
			}
				else if(skipi)b--;
				else if(skipb)i++;
				else return false;
			}
			skipi= false;
			skipb = false; 
			i--;
		}
		return true;
	}
	
	public static void main(String[] args){
		String test1 = "Was it a car or a cat I saw?";
		String test2 = "A man, a plan, a canal, Panama!";
		String test3 = "Amor, Roma";
		String test7 = "race car";
		String test4 = "put it          up";

		String test5 = "st,:ep on: n:o pets";
		

		if(Character.isLetterOrDigit(',')){
			System.out.println("is a digit: ,");
		}
		if(Character.isLetterOrDigit('.')){
			System.out.println("is a digit: .");
		}
		if(Character.isLetterOrDigit(' ')){
			System.out.println("is a digit: ");
		}
		if(Character.isLetterOrDigit('/')){
			System.out.println("is a digit");
		}
		if(isPalindrome(test5)) System.out.println("true");
		else System.out.println("false");

		if(isPalindrome(test7)) System.out.println("true");
		else System.out.println("false");

		
	}
}
