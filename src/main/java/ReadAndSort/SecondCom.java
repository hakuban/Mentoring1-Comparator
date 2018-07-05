package ReadAndSort;

import java.util.Comparator;

public class SecondCom implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		
		return  o2.substring(o2.length()-2).compareTo(o1.substring(o1.length()-2));
	}

}
