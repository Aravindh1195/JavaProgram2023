package day08;

public class Program02 {
	


	public static void main(String[] args) {
		
		int a=10;
		int b=2;
		int c=2;
		int d=10;
		
		if(a>=b && a>=c && a>=d)
		{
			if(a==b && a==c &&a==d)
			{
				System.out.println("a,b,c and d are equal");
			}
			else if(a==b && a==c && a>d)
			{
				System.out.println("a & b & c are equal and greater than c");
			}
			else if (a==c && a==d && a>b)
			{
				System.out.println("a & c & d  are equal and greater than b");
			}
			else if (a==b && a==d && a>c)
			{
				System.out.println("a & b & d  are equal and greater than c");
			}
			else if(b>c && c>d)
			{
				System.out.println("a is greater than b and b is greater than c and c is greater than d");
			}
			else if(c>b &&  b>d )
			{
				System.out.println("a is greater than c and c is greater than b and b is greater than d");
			}
			else if(b>c && c==d)
			{
				System.out.println("a is greater than b and b is greater than c and c & d are equal");
			}
			else if(c>b &&  b==d )
			{
				System.out.println("a is greater than c and c is greater than b and b & d are equal");
			}
	
			else
			{
				System.out.println("a is greater than b & c & d and b & c & d are equal");
			}
			
		}
		
		else if(b>=a && b>=c && b>=d)
		{
			if(a==c && c==d)
			{
				System.out.println(" a & c & d are equal and greater than b");
			}
			else if(a>c && c>d)
			{
				System.out.println("b is greater than a,a is greater than c,c is greater than d");
			}
			else if(c>a && a>d)
			{
				System.out.println("b is greater than c,c is greater than a, a is greater than d");
			}
			
			else
			{
				System.out.println("b is greater than a&c&d,a&c&d are equal");
			}
			
		}
		
		
		    else if(a>b && b>d)
			{
				System.out.println("c is greater than a,a is greater than b,b is greater than d ");
			}
			else if(d>a && a>b)
			{
				System.out.println("c is greater than d,d is greater than a,a is greater than b");
			}
			else
			{
				System.out.println("c is greater than a&b&d, a&b&d are equal");
			}
		
		   
		    {
				if(c>b && b>a)
				{
					System.out.println("d is greater than c,c is greaterb than a,");
				}
				else if(a>b && b>c)
				{
					System.out.println("d is greater than a,a is greater than b,b is greater than c");
				}
				else
				{
					System.out.println("d is greater than a&b&c, a&b&c are equal");
				}
				
				
		}

}

}
