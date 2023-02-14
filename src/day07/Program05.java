package day07;

import java.util.Scanner;

public class Program05 {
	
	public static void main(String[] args) {
		
		Scanner x=new Scanner(System.in);
		
		System.out.println("Enter the Numbers:-  ");
		int a=x.nextInt();
		
		System.out.println("Enter the Numbers:-  ");
		int b=x.nextInt();
		
		System.out.println("Enter the Numbers:-  ");
		int c=x.nextInt();
		
		x.close();
		
		if(a>b && a>c)
		{
			System.out.println("a is greater...!");
		}
		else if(b>a && b>c)
		{
			System.out.println("b is greater...!");
		}
		else if(c>a && c>b)
		{
			System.out.println("c is greater...!");
		}
		else if(a==b && c>a)
		{
			System.out.println("a and b are equal, c is greater...!");
		}
		else if(b==c && a>b)
		{
			System.out.println("b and c are equal, a is greater...!");
		}
		else if(c==a && b>a)
		{
			System.out.println("c and a are equal, b is greater...!");
		}
		
		
		
	}

}
