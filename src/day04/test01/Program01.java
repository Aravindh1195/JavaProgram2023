package day04.test01;

public class Program01 {
	
	public static void addMethod(int a,int b)
	{
		System.out.println(a+b);
	}
	private static void subMethod(int a,int b)
	{
		System.out.println(a-b);
	} 
	protected static void mulMethod(int a,int b)
	{
		System.out.println(a*b);
	}
	static void sqrtMethod(int a)
	{
		System.out.println(a*a);
	}
	
	public void addMethodNonstatic(int a,int b)
	{
		System.out.println(a+b);
	}
	private void subMethodNonstatic(int a,int b)
	{
		System.out.println(a-b);
	} 
	protected void mulMethodNonstatic(int a,int b)
	{
		System.out.println(a*b);
	}
	void sqrtMethodNonstatic(int a)
	{
		System.out.println(a*a);
	}
	
	public static void main(String[] args) {
		addMethod(44,55);
		subMethod(84,45);
		mulMethod(45,35);
		sqrtMethod(10);
		
		Program01 x=new Program01();
		x.addMethodNonstatic(21,55);
		x.subMethodNonstatic(45,54);
		x.mulMethodNonstatic(45,84);
		x.sqrtMethodNonstatic(14);
		
		
	}
	

}
