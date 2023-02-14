package day06.test01;

import java.util.Scanner;

public class Program02 {
	
	public static void main(String[] args) {
		// + - * /(Q) %(R) Numbers
		Scanner x=new Scanner(System.in);
		
		System.out.println("Entrer int value of a:-");
		int a=x.nextInt();
		
		System.out.println("Entrer int value of a:-");
		int b=x.nextInt();
		
		System.out.println("Entrer double value of a:-");
		double c=x.nextDouble();
		x.close();
		
		// int () int--->int
		// int () double/float--->double/float
		
		System.out.println(a+b);
		System.out.println(a+c);
		
		System.out.println(a-b);
		System.out.println(a-c);
		
		System.out.println(a*b);
		System.out.println(a*c);
		
		System.out.println(a/b);
		System.out.println(a/c);
		
		System.out.println(a%b);
		System.out.println(a%c);
		

	}


}
