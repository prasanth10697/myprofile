package com.basic;

public class admin {
public static void main(String args[])
{
	int sum = 0;
	String sum2 = "";
	for(int i=0;i<args.length;i++)
	{
		sum = sum + Integer.parseInt(args[i]);
		sum2 = sum2 + args[i];
	}
	System.out.println(sum);
	System.out.println(sum2);
}
}
