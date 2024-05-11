package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListFunctionality {

	
	public static void main(String[] args) {
		
		
		
		List<String> l= new ArrayList<>();
		l.add("vijay");
		l.add("kumar");
		l.add("paila");
		l.add("kiran");
		l.add("praneet");
		
		System.out.println(l);
		
		List<String> l1= new ArrayList<>(List.of("a","b","c","d"));
		System.out.println(l1);
		
		Integer [] num= {2,3,4,5,6};
		
		List l3=Arrays.asList(num);
		System.out.println(l3);
		
		 Iterator ite=l.iterator();
		 while(ite.hasNext())
		 {
			 System.out.println(ite.next());
		 }
		 
		 for(int i=0;i<l.size();i++)
		 {
			 System.out.println(l.get(i));
		 }
		
		for(String l5:l)
		{
			System.out.println(l5);
		}   
		
		
		
		
		
	}
}
