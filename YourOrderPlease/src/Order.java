import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Order {
	
	public static String order(String words) {
	    if(!words.equals("")){
	      String texts[] = words.split(" "); 
	      String[] orderList = new String[texts.length];
	      for(String text : texts){  	
	      	orderList[getNumberFromText(text)-1] = text;
	      } 
	      words = orderList[0];
	      for(int i=1;i<orderList.length;i++){   	
	      	words +=" "+orderList[i];
	      }
	    }
	    return words ;		
	  }
	  
	  public static int getNumberFromText(String text){
		  Matcher matcher = Pattern.compile("\\d+").matcher(text);
		  matcher.find();
		  return Integer.parseInt(matcher.group(0));	  
	  }
  
  public static void main(String args[]){
	  
	  System.out.println(order("is2 Thi1s T4est 3a"));
  }
}
