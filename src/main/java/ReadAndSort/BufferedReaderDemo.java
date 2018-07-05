package ReadAndSort;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.github.javafaker.Faker;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException    {
//		Faker faker=new Faker();
//		for(int i=0; i<100; i++) {
//			System.out.println(faker.address().fullAddress());
//		}
//		
		BufferedReader br=new BufferedReader(new FileReader("/Users/haku/Desktop/Address.txt"));
		System.out.println(br.readLine());
		
		
	}

	
}
