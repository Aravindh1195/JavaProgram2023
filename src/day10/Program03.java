package day10;

public class Program03 {

	public static void main(String[] args) {
		
		int table=2;
		System.out.println("----While program----");
		int a=1;
		while(a<=10)
		{
			System.out.println(table+"x"+a+"="+table*a);
			a=a+1;
		}
		
		System.out.println("----Do---While program----");
		int b=1;
		do{
			System.out.println(table+"x"+b+"="+table*b);
			b=b+1;
		}while(b<=10);
		
		System.out.println("----For program----");
		for(int c=1;c<=10;c=c+1)
		{
			System.out.println(table+"x"+c+"="+table*c);
			
		}
		

	}

}
