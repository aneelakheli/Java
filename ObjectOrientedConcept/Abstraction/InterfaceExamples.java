package ObjectOrientedConcept.Abstraction;
// Java program to demonstrate working of

// interface

import java.io.*;

// A simple interface
interface In1 {

	// public, static and final
	final int a = 10;

	// public and abstract
	void display();
}

// A class that implements the interface.
class InterfaceExamples implements In1 {

	// Implementing the capabilities of
	// interface.
	public void display() {
		System.out.println("not impossible");
	}

	// Driver Code
	public static void main(String[] args) {
		InterfaceExamples t = new InterfaceExamples();
		t.display();
		System.out.println(a);
	}
}
