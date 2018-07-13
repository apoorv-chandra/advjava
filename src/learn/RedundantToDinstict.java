package learn;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RedundantToDinstict {

	public static void main(String[] args) {
		String[] str = {"abc", "dcs", "Abg","abc","hdf"};
		 List<String> al = Arrays.asList(str);
		   LinkedList<String> ll = new LinkedList<String>(Arrays.asList(str));
		   HashSet<String> araytohahset = new HashSet<>(Arrays.asList(str));
		   LinkedHashSet<String> arraytolinkedhashset = new LinkedHashSet<>(Arrays.asList(str));
		 System.out.println(al);
		 System.out.println(ll);
		 System.out.println(araytohahset);
		 araytohahset.add("jao-daya");
		 System.out.println(araytohahset);
		 System.out.println(arraytolinkedhashset);
		 arraytolinkedhashset.add("daya-gaya");
		 System.out.println(arraytolinkedhashset);
		 int i=0;
/*		 Map<String, Integer> cards2Length = (Map<String, Integer>) al.stream()
				 .collect(Collectors.toMap(Function.identity(),
						 String::length, (e1, e2)-> +i, HashMap::new)); 
		 System.out.println("map: " + cards2Length);
		 
*/
		
		 Map<String, Integer> arrtomap = new HashMap<String, Integer>();		 
		 for (String string : str) {
			arrtomap.put(string, ++i);
		}
		 System.out.println(arrtomap);
	}

}
