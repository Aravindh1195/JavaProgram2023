package day04.test02;

import day04.test01.Program01;


class Program03 extends Program01{
	
	public static void main(String[] args) {
		
		addMethod(44,55);
		//subMethod(84,45);
		mulMethod(45,35);
		//sqrtMethod(10);
		
		Program03 x=new Program03();//current class object
		x.addMethodNonstatic(21,55);
		//x.subMethodNonstatic(45,54);
		x.mulMethodNonstatic(45,84);
		//x.sqrtMethodNonstatic(14);
		
		Program01 y=new Program01();
		y.addMethodNonstatic(11,20);
		
	}

}
