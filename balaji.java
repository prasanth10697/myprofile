package com.basic;

public class balaji {
public static void main(String args[])
{
	int array[]=new int[]{3 , 4, 5, 2, 33, 24, 2};
	int max=getMax(array);
	System.out.println("Maximum Value is:"+max);
	int min=getMin(array);
	System.out.println("Minimum Value is:"+min);
}
public static int getMax(int[] intArray)
{
	int maxValue = intArray[0];
	for(int i=0;i < intArray.length;i++)
	{
		if(intArray[i]> maxValue)
		{
			maxValue = intArray[i];
		}
	}
	return maxValue;
}
public static int getMin(int[] intArray)
{
	int minValue =intArray[0];
	for(int i=0;i< intArray.length;i++)
	{
		if(intArray[i]<minValue)
		{
			minValue =intArray[i];
		}
	}
	return minValue;
}
}
