package javaPrograms;

public class CountSubString {

	
	public static void main(String[] args) {
		
		String str="abcndcabcndcabcndcertsdfertsdf";
		String sub="ndc";
		int index=str.indexOf(sub);
		int count=0;
		
		while(index!=-1)
		{
			count++;
			index=str.indexOf(sub,index+1);
		}
		System.out.println(str+" : "+sub+ " : "+ count);
	}
}
