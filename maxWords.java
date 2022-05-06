package ArraysDS;

import java.util.*;


public class maxWords {

	public static void main(String[] args) {
		String[] arr= {"i am ruhi","I am an engineer","I work at faang"};
		countMaxwords(arr);

	}

	private static void countMaxwords(String[] arr) {
		HashMap<Integer,String> hs=new HashMap<>();
		for(String s:arr) {
			hs.put(1, s);
		}
		
	}

}
