package day05.test01;

public class Program04 extends Program03 {
	
	public static void main(String[] args) {
		Program04 x=new Program04();
		x.add(10, 20);
		
	}

	@Override
	public void add(int a,int b)
	{
		System.out.println((a*a)+(b*b));
	}
}
