//Method Overloading: Same method name but different arguments(Compiletime polymorphism)
package OopsConcepts;

import java.util.Arrays;

public class Polymorphism_MethodOverloading {

	public void addition(int a ,int b) {
		int add=a+b;
		System.out.println("addition of two numbers a and b= " +add);
	}
	
	public void addition(int a ,int b, int c) {
		int add=a+b+c;
		System.out.println("addition of three numbers a, b and c= " +add);
	}
	public void addition(String bookName) {
		System.out.println("Addition formula you can refer from the book: " +bookName);
	}
	
	public void addition(String[] Name) {
		String[] ff=Arrays.copyOf(Name, Name.length);
		for(String auther: ff)
			System.out.println("Auther is: " +auther);
	}
	
	
	
	public static void main(String[] args) {
		
		Polymorphism_MethodOverloading poly1=new Polymorphism_MethodOverloading();
		poly1.addition("Basic Mathematics");
		poly1.addition("And Arithmatic");
		poly1.addition(new String[] {"KudVenket","R Maheshwari","Rahul Shetty","A Kulkarni"} );
		poly1.addition(2, 3);
		poly1.addition(2, 3, 5);
	}
}
