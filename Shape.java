package com.basic;

public class Shape {
 double side;
 double length;
 double breadth;

public Shape(double side) {
this.side=side; 
}
public Shape (double length,double breadth)
{if(length>0.0 && length>10.0 && breadth<20.0) {
	this.length=length;
this.breadth=breadth;
}else
{
	System.out.println("find the number of larger than 0.0 and less than 20.0");
	}
}
public double findAreaofbreadth() {
return length * breadth;
}

	public static void main(String[] args)
	{
		Shape square= new Shape(5.1);
		Shape rectangle =new Shape(13.5,15.5); 
		System.out.println(rectangle.findAreaofbreadth());
}
}



