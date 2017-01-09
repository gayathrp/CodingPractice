import java.util.ArrayList;
import java.util.HashMap;

public class ManagerHashMap {
	public static void main(String args[]) {
		HashMap<String,String> inputMap = new HashMap<>();
		inputMap.put("A", "C");
		inputMap.put("B", "C");
		inputMap.put("C", "F");
		inputMap.put("D", "E");
		inputMap.put("E", "F");
		inputMap.put("F", "F");
		HashMap<String, ArrayList<String>> rMap = reverseMap(inputMap);
		getEmployeeCount(rMap, inputMap);
	}

	private static void getEmployeeCount(HashMap<String, ArrayList<String>> rMap, HashMap<String, String> inputMap) {
		HashMap<String, Integer> resultMap = new HashMap<>();
		for(String s : inputMap.keySet()) {
			if(!rMap.containsKey(s))
				resultMap.put(s, 0);
			else {
				int count = 0;
				int len = rMap.get(s).size();
				for(int i = 0 ; i < len ; i++) {
					String val = rMap.get(s).get(i);
					count++;
					if(rMap.containsKey(val)) {
						count = count + rMap.get(val).size();
					}
				}
				resultMap.put(s, count);
			}
		}
		System.out.println(resultMap);
	}


	private static HashMap<String, ArrayList<String>> reverseMap(HashMap<String, String> inputMap) {
		HashMap<String, ArrayList<String>> rMap = new HashMap<>();
		for(String s : inputMap.keySet()) {
			String val = inputMap.get(s); 
			if(!s.equals(val)) {
				if(rMap.containsKey(val))
					rMap.get(val).add(s);	
				else {
					ArrayList<String> list = new ArrayList<>();
					list.add(s);
					rMap.put(val, list);
				}
			}
		}
		System.out.println(rMap);
		return rMap;
	}	
}
