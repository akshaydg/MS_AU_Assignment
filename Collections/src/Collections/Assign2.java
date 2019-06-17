package Collections;

import java.util.*;

public class Assign2 {
	
	public static List<String> getSorted(String[] str)
	{
		
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		for(int i=0;i<str.length;i++) {
			map.put(str[i],map.getOrDefault(str[i],0)+1 );
		}
		
		
		List<Map.Entry<String, Integer>> entries=new ArrayList<>(map.entrySet());
		Collections.sort(entries,new Comparator<Map.Entry<String, Integer>>() {
			@Override
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				if(o1.getValue()<=o2.getValue())
				{
					return 1;
				}
				else
				{
					return -1;
				}
			}});
		List<String> sortedStringsByFrequency=new ArrayList<String>();
		for(Map.Entry<String, Integer> entry:entries)
		{
			sortedStringsByFrequency.add(entry.getKey());
		}
		return sortedStringsByFrequency;
	}
	
	public static void print(List<String> ar)
	{
		for(String s:ar)
		{
			System.out.print(s+", ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter no of strings ");
		int no=input.nextInt();
		String[] str=new String[no];
		System.out.println("Enter one word strings ");
		for(int i=0;i<no;i++) {
			str[i]=input.nextLine();
		}
		
		
		
		print(getSorted(str));
		
		
			
		input.close();
	}

}
