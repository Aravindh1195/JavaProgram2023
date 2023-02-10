package day04.test02;

import day04.test01.Program01;

public class Program04 {

	public static void main(String[] args) {
		Program01 x=new Program01();
		x.addMethodNonstatic(10,20);
		//x.mulMethodNonstatic(30,20);protected method will not visible from one package to another
		

	}

}
