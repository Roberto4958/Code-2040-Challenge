import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;



public class AddressValidation {
	
	public static String check(String input){
		String answer = "Neither";
		if(checkifIPv4(input)) return "IPv4";
		if(checkIfIPv6(input)) return "IPv6";
		return answer;
	}

	
	
	public static boolean checkifIPv4(String input){
		if(input.length()<7 || input.length()>15) return false;
		
			  int start=0;
			  int counter =0;
			  
			for(int i=0; i<input.length(); i++){
				
				while(!(input.substring(i, i+1).equals("."))&&i<input.length()-1){
					
					i++;					
				}
				
				counter++;
				String current = input.substring(start, i);
				if(i==input.length()-1) current = input.substring(start,input.length());
				start = i+1;
				try{
					int b = Integer.parseInt(current);
					if(0>b||b>255) return false;
				}
				catch(NumberFormatException e){
					return false;
				}
				
			}
			
			if(counter != 4)return false;
			
			return true;
		}
	
	
	  public static boolean checkIfIPv6(String input){
		  int start =0;
		     int counter =0;
		        for(int i= 0; i<input.length();i++){
		            
		            if(input.charAt(i)== ':'){
		            	String hex = input.substring(start, i);
		            	start = i+1;
		            	counter++;   
		            	try{
		            	Long h = Long.parseLong(hex, 16);
		               if(h<0 || h>65535 ) return false;
		            	}
		            	catch(NumberFormatException e){
		            		return false;
		            	}
		            }
		               
		        }
		       if(counter != 6){
		           return false;
		       }
		       else return true;
		   }
		   
	public static void main(String[] args) throws IOException{
		/*
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String s = reader.readLine();    

		int numOfLines = Integer.parseInt(s);
		
		System.out.println();
		ArrayList<String> collection = new ArrayList<String>();
		for(int i=0; i<numOfLines; i++){
			String input = reader.readLine();
			collection.add(input);
		}
		for(int b=0; b<numOfLines; b++){
		System.out.println(check(collection.get(b)));
		
		}
		 public static boolean checkIfIPv6(String input){
		     int counter =0;
		        for(int i= 1; i<input.length();i++){
		            
		            if(input.charAt(i)== ':') counter++;    
		                else {
		                if(!(isHex(input.charAt(i)))){
		                   
		                    return false;
		                } 
		            }
		        }
		       if(counter != 7){
		          System.out.println("counter is not 7");
		           return false;
		       }
		       else return true;
		   }
		    public static boolean isHex(char input){
		        if((input>='0'&& input<='9')|| (input>='a'&& input<='f')|| ((input>='A'&& input<='F')))return true;
		        
		        else return false;
		    }
		*/
		

	
		String test1 = ".20.20.20";
		String test2 = "127.18.19.90";
		String test3 = "2001:7zb8:0:0:ff00:0042:8329";
		
		System.out.println(check(test1));
		System.out.println(check(test2));
		System.out.println(check(test3));
		
		
		
		

		

	}

}
