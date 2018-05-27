import java.util.HashMap;

public class HashMapCalculator {
public static int commonKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
	int numbercounter =0;
		for (String x : hashmap1.keySet()) {
			if(hashmap2.containsKey(x)){
			 if(hashmap2.get(x) == hashmap1.get(x)){
				 
				
						numbercounter+=1;
					}
				}
			
		}
		return numbercounter;
	}
}

