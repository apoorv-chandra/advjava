package learn;
import java.util.ArrayList;
import java.util.List;

public class ArrayListToArray {
	 public static void main(String[] args) {
	        List<String> list = new ArrayList<String>();
	        
	        list.add("array");
	        list.add("arraylist");
	        list.add("convertion");
	        list.add("javaprogram");
	        
	        String [] str = list.toArray(new String[list.size()]);
	        
	        for (int j = 0; j < str.length; j++) {
	        	  System.out.println(str[j]);			}  
	    } 
	
}
