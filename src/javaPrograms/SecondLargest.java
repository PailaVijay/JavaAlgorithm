package javaPrograms;

public class SecondLargest {

	public static void main(String[] args) {
		
		int [] num= {45,23,56,24,60,75,82};
		int len=num.length;
		int max1=0;
		int max2=0;
		
		for(int i=0;i<len;i++)
		{
			if(num[i]>max1)
			{
				max2=max1;
				max1=num[i];
			}
			else if(num[i]>max2)
			{
				max2=num[i];
			}
		}
		System.out.println(max1);
		System.out.println(max2);

	}

}
