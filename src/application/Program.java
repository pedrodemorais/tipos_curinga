package application;

import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<Integer> lista = Arrays.asList(5,2,10);
		printList(lista);
		
		List<String> listString = Arrays.asList("Maria, Pedro, João");
		printList(listString);
		

	}
	
	public static void printList(List<?> list) {
		for(Object obj: list) {
			System.out.println(obj);
			
		}
		
		
	}

}
