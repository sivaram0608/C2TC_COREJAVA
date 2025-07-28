package com.tnsif.daySix.usingVariable;

public class FinalVariable {

	// final instance variable initialized at declaration
	final int X = 100;

	// Declare a static blank final variable
	final static int Y;

	// Declare & initialize static final variable
	final static int Z = 10;

	// instance method
	void show() {
		// Cannot reassign final variables, so just print
		System.out.println("Final instance variable X = " + X);
		System.out.println("Final static variable Y = " + Y);
	}

	@Override
	public String toString() {
		return "FinalVariable [X=" + X + ", Y=" + Y + "]";
	}

	// Static block to initialize Y only once
	static {
		Y = 20;
		// Z = 100; // ❌ NOT allowed: Z already initialized
		System.out.println("Static block: Value of Y initialized to " + Y);
	}

	public static void main(String[] args) {
		FinalVariable obj = new FinalVariable();
		obj.show();
		System.out.println(obj);
	}
}
