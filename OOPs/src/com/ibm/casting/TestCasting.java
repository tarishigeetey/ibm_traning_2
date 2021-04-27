package com.ibm.casting;

public class TestCasting {

	public static void main(String[] args) {
		Alpha a = new Alpha();
		a.demo();
		//Beta bt = (Beta)a; //Error
		
		Beta b = new Beta();
		b.test();
		b.demo();
		
		Alpha ab = b; //Up-Casting - Implicit
		ab.demo();
		//ab.test(); //Error - Parent class refrence cannot access child class member
		
		Beta ba = (Beta)ab; //Down-Casting - Explicit
		ba.demo();
		ba.test();

	}

}
