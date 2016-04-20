

public class Driver  
 { 
 	public static void main(String[] args) 
 	{ 
 		String s = "hello world";
 	//	String answer = 
 	//	System.out.println(answer);
 		//String answer = Driver.decimalToBase(num);
	//	System.out.println(Driver.decimalToBase(11, 2));
		//System.out.println(answer);
		System.out.println(Driver.toCharArray(s));
 	}
 	
 	
 	static char[] toCharArray(String s){
 		String result = "";
 		char[] A = s.toCharArray();
 		
 	      for (int i = 0 ; i < s.length() ; i++ ) {  
 	    	  if (s.charAt(i)== 'h' || s.charAt(i)== 'e'||s.charAt(i)== 'l'||s.charAt(i)== 'l'||s.charAt(i)== 'o')
 	    	  
 	    	result = s.charAt(i) + "";
	 
 	         }

 	       

 	         
 	         return A;
 	       }
 	     
 	    
 	static String substring(String s, int beginPos, int endPos){
 		String answer = "";
 		
 		
 		
 		for (int i = beginPos; i < endPos; i++){
 			
 			answer += s.charAt(i);
 			
 		}
 		return answer;
 	}
	static String substring(String s,int pos)
	{
		String answer = "";
		for (int i = pos; i < s.length(); i++)
		{
			answer += s.charAt(i);
			//answer = answer + s.charAt(i);
		}
			return answer;
	}
 
 	
 	static String decimalToBase(int decimalNumber, int radix){
 		
 		//params - decimalNumber, radix
 		
 
 		//while decimalNumber is greater than 0
 		String binary = "";
        while (decimalNumber > 0) {
            radix = decimalNumber % 2;
            binary = radix + binary;
            decimalNumber = decimalNumber / 2;
        }
        return binary;
 			//convert decimalNumber modulo radix into a char using your intToChar function
 			
 			
 		}
 		
 		//record the result (String variable that we keep building up)
 		//modify decimalNumber to itself / radix
 		//return the String variable with our result if we built it in reverse or return the reverse of that value if we built in with normal concatenation.
 	
 	static char intToChar(int val){
 		
 		String s = "123456789ABCDEF";
 				
 		return s.charAt(val);
 		
 		//this guy returns the char equivalent of the integer parameter
 		//4 -> ‘4’
 		//7 -> ‘7’
 		//13 -> ‘D’
 	}
 		
 		
 	
 	//this guy should take a String representation of a binary number 
 	//as a parameter and return as a int the decimal equivalent 
 	//"1011" -> 11 
 	static int binaryToInteger(String bin) 
 	{ 
 		int result = 0; 
 		int base = 2; 
 		int numValue; 
 		
 			for (int i = bin.length()-1; i >= 0; i--){
 			numValue = bin.charAt(i);
 				
 				if ( bin.charAt(i) == 0 ){
 					
 					return numValue;
 					
 				}else {
 					
 					result += numValue + base;
 					
					base ^= i++;
 					
 					return result ; 
 				}
 				
 			}
 		 return result;
 	} 
 	 
 	//return the integer version of the char parameter 
 	static int charToInt(char c) 
 	{ 
 		return "0123456789".indexOf(c); 
 	} 
 	 
 	//Converts s, which is a string representation 
 	//of an int into an int representation 
 	//"124" -> 124 
 	static int stringToInt(String s) 
 	{ 
 		int place = 1; 
 		int total = 0; 
 		char currChar; 
 		for(int i = s.length()-1; i >= 0; i--) 
 		{ 
 			currChar = s.charAt(i); 
 			if(currChar == '-') 
 			{ 
 				return total * -1; 
 			} 
 			else 
 			{ 
 				total += (Driver.charToInt(currChar) * place); 
 				place *= 10; 
 			} 
 		} 
 		return total; 
 	} 
 	 
 	static String removeChars(String s, String charsToRemove) 
 	{ 
 		String answer = ""; 
 		for(int i = 0; i < s.length(); i++) 
 		{ 
 			//should we keep the current character 
 			if(charsToRemove.indexOf(s.charAt(i)) == -1) 
 			{ 
 				answer = answer + s.charAt(i); 
 			} 
 		} 
 		return answer; 
 	} 
 	 
 	//returns a new String with all of the vowels 
 	//removed form the parameter String 
 	//"hello" -> hll 
 	static String removeVowels(String s) 
 	{ 
 		return Driver.removeChars(s, "aeiouAEIOU"); 
 	} 
 	 
 	//returns a new String with all of the consonants 
 	//removed form the parameter String 
 	//"hello" -> eo 
 	static String removeConsonants(String s) 
 	{ 
 		return Driver.removeChars(s, "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ"); 
 	} 
 		 
 	//returns a new String with all of the numbers 
 	//removed form the parameter String 
 	//"he11o" -> heo 
 	static String removeDigits(String s) 
 	{ 
 		return Driver.removeChars(s, "0123456789"); 
 	} 
 		 
 	//return the first occurence in s where c is found or -1 if  
 	//it was not found - we can't use the String's indexOf 
 	static int indexOf(String s, char c) 
 	{ 
 		for(int i = 0; i < s.length(); i = i + 1) 
 		{ 
 			if(s.charAt(i) == c) 
 			{ 
 				return i; 
 			} 
 		} 
 		//if we are still kicking.... 
 		return -1; 
 	} 
 	 
 	static void displayString(String s) 
 	{ 
 		//should display the contents of the String one character per line 
		for(int i = 0; i < s.length(); i = i + 1) 
 		{ 
 			System.out.println(s.charAt(i)); 
 		} 
 	} 
 	 
 	static void displayWithSpaces(String s) 
 	{ 
 		String answer = ""; 
 		for(int i = 0; i < s.length(); i = i + 1) 
 		{ 
 			answer = answer + s.charAt(i) + " "; 
 		} 
 		System.out.println(answer); 
 	} 
 	 
 	//this method should display on a single line the input String 
 	//in reverse: "hello" -> "olleh" 
 	static String reverseString(String s) 
 	{ 
 		String answer = ""; 
 		for(int i = s.length()-1; i >= 0; i = i - 1) 
 		{ 
 			answer = answer + s.charAt(i); 
 		} 
 		return answer; 
 	} 
 } 
