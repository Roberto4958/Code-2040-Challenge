import java.util.*;
import java.io.*;

import java.text.*;
import java.math.*;
import java.util.regex.*;


public class SubStringCalculator {
	
	public static int calculator(String input){
		//ArrayList<String> collection = new ArrayList<String>();
		HashMap<String, String> collection = new HashMap<String, String>();
	
		int count =0;
		for(int b =0; b<input.length(); b++){
		for(int i= input.length(); i>b;i--){
			boolean existe = false;
			existe=collection.containsValue(input.substring(b, i));
			/*for(int g=0; g<collection.size() ; g++){
				if(input.substring(b, i).equals(collection.get(g)))existe = true;	
			}*/
			if(!existe){
				collection.put(input.substring(b, i), input.substring(b, i));
				count++;
				System.out.println(count + ": "+input.substring(b, i));	
			}
		}	
	}
		return count;
	}
	
	public static void main(String[] args){
		String test1 = "kincenvizh";
		
		int test = calculator(test1);
		System.out.println(test+" subString were found");
	}
}
