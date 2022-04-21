package in.sterling.collectionframework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hm=new HashMap<Integer, String>(); 
			hm.put(101, "one");
			hm.put(102, "Two");
			hm.put(103, "Three");
			hm.put(104, "Four");
			hm.put(105, "Five");
	
	//Iteration using ForEach loop with keyset method
/*			
			for(int i:hm.keySet()) {
				System.out.println(i+" == "+hm.get(i));
			}
*/	
	
			//iteration using iterator 
			//Set<String> s=hm.keySet();
		//	Iterator<String> it=s.iterator();
			
	}

}
