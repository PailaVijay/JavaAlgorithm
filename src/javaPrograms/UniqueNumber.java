package javaPrograms;

import java.util.HashSet;

public class UniqueNumber {

	public static void main(String [] args)
	{
		
		String s= "abcab";
		
		HashSet<Character> set= new HashSet<Character>();
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(set.contains(ch)==true)
			{
				set.remove(ch);
			}
			else
			{
				set.add(ch);
			}
		}
		if(set.size()==0)
		{
			System.out.println("no unique chararcter");
		}
		for(Character c:set)
		{
			System.out.println(c+" ");
		}
	}
}
