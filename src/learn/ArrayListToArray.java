package learn;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayListToArray {
	 public static void main(String[] args) {
		 String[] str = {"abc", "dcs", "Abg","abc","hdf"};
		 List<String> list = new ArrayList<String>();
	        
	        list.add("array");
	        list.add("arraylist");
	        list.add("convertion");
	        list.add("javaprogram");
	        
	        String [] str1 = list.toArray(new String[list.size()]);
	        
	        for (int j = 0; j < str1.length; j++) 
	        {
	        	  System.out.println(str1[j]);			
	        }
	    		  //Counting frequency of words in string array
	    		  Map<Object, Long> freqCaseIn = Arrays.stream(str)
	    				  .collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));
	    		  System.out.println(freqCaseIn);
	 
	    		 
	 } 
	
}
