package Original.PredirectorRound;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AuditMapExtendable {
	
	static final int size = 10000000;
	static List<List<String>> list = new ArrayList<>();

	public static void initiliase() {
		for (int i = 0; i < size; i++) {
			list.add(i, new ArrayList<>());
		}
	}

	public static void addElement(int key, String val) {
		if (key > size-1) {
			System.out.println("insertion of this long integer is not possible, please enter key "
					+ "in the range of 0-99999");
			return;
		} else {
			list.get(key).add(val);
		}
	}

	public static List<String> getValues(int key) {
		List<String> values = list.get(key);
		return values;
	}

	public static String getRecentValue(int key) {
		List<String> values = list.get(key);
		return values.get(values.size() - 1);
	}
	
	public static void main(String[] args) {
		initiliase();
		Map<Integer, String> hmap = new HashMap<>();
		int key = 100000;
		String val1 = "Hello1";
		String val2 = "Hello2";
		String val3 = "Hello3";
		String val4 = "Hello4";
		//adding elements into audit map
		addElement(key, val1);
//		addElement(key, val2);
//		addElement(key, val3);
//		addElement(key, val4);
		
		List<String> values = getValues(key);
		System.out.println("values for key: " + key + " : values: " + values);
		System.out.println(getRecentValue(key));

	}

}
