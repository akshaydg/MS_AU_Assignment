//Frequency of each character
package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Assign1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		str=str.toUpperCase();
		
		HashMap<Character,String> map = new HashMap<Character,String>();
		//HashMap<Character, Integer> map=new HashMap<Character,Integer>();
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			map.put(ch,map.getOrDefault(ch,"")+"#");
			
		}
		
		  
		
		for(char ch='A'; ch<='Z';ch++) {
			if(map.containsKey(ch)) {
				System.out.println(ch+" "+map.get(ch));
			}
		}
		

	}

}
