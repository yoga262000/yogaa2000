package org.array;

public class sample {
 public static void main(String[] args) {
	int a [] = new int[6];
	
	a[0]=10;
	a[1]=20;
	a[2]=30;
	a[3]=40;
	a[4]=50;
	a[5]=60;
	
	int length = a.length;
	System.out.println(length);
	
	System.out.println("*****************");
	
	System.out.println(a[5]);
	System.out.println("********************");
	
	for (int i = 0; i < a.length; i++) {
		System.out.println(i);
		
	for (int j : a) {
		System.out.println(j);
	}	
		
	}
	
	
}
}
