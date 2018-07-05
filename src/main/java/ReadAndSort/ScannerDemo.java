package ReadAndSort;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) throws FileNotFoundException   {
		
		Scanner sc=new Scanner(new FileReader("Address.txt"));
		String temp="";
		List<String> list=new ArrayList<>();
		while(sc.hasNext()) {
			temp=sc.nextLine();
			int firstIndex=temp.indexOf(",")+2;
			int lastIndex=temp.indexOf(",", firstIndex);
			String city=temp.substring(firstIndex,lastIndex);
			//System.out.println("<"+city+">");
			list.add(city);
			
		}//end
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		Comparator<String> c=new NameComparator();
		Collections.sort(list,c.reversed());
		System.out.println(list);
		
		Comparator<String> d=new SecondCom();
		Collections.sort(list,d);
		System.out.println(list);
		
		
	}
}
