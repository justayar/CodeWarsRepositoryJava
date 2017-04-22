
public class DuplicateEncoder {
	
	private static char openingSymbol = '(', closingSymbol = ')';
	private static char emptyChar = ' ';
	public static String encode(String word){
		char[] wordChars = word.toLowerCase().toCharArray();
		char[] wordCharsResult = new char[wordChars.length]; 
	    for(int i=0;i<wordChars.length;i++){
	    	char currentChar = wordChars[i];
	    	boolean isDuplicate = false;
	    	if((int)wordCharsResult[i] == 0){ // check whether it is already rendered or not
		    	for(int j=i+1;j<wordChars.length;j++){
		    		if(wordChars[j] == currentChar){   			
		    			wordCharsResult[j] = closingSymbol;
		    			isDuplicate = true;
		    		}
		    	}
		    	if(isDuplicate){
		    		wordCharsResult[i] = closingSymbol;	    		
		    	}else{	    		
		    		wordCharsResult[i] = openingSymbol;
		    	} 
	    	}
	    		
	    } 
	    return String.valueOf(wordCharsResult);
	  }
}
