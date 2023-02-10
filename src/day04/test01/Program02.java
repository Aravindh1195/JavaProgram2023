package day04.test01;

public class Program02 extends Program01 {
	
	public static void main(String[] args) {
		
		addMethod(44,55);
		//subMethod(84,45);
		mulMethod(45,35);
		sqrtMethod(10);
		
		Program01 x=new Program01();
		x.addMethodNonstatic(21,55);
		//x.subMethodNonstatic(45,54);
		x.mulMethodNonstatic(45,84);
		x.sqrtMethodNonstatic(14);
		
		
	}

}
