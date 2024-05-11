package javaPrograms;

public class SubSequence {

	
	public static void main(String[] args)
	{
		String country="india";
		String sub="ind";
		
		if(subSeq(country,sub))
		{
			System.out.println("it is subSequence");
		}
		else
		{
			System.out.println("not a subSequence");
		}
		
		
	}
	
	public static boolean subSeq(String country,String sub)
	{
		int m=country.length();
		int n=sub.length();
		int i=0,j=0;
		
		while(i<m && i<n)
		{
			if(country.charAt(i)==sub.charAt(j)) // india ind
			{
				i++;
				j++;
				
			}
			
		}
		return i==n;
	}
	
}
