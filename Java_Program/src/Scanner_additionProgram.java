import java.util.Scanner;

public class Scanner_additionProgram {

	public static void main(String[] args) {
		float a,b,sum;
		System.out.print("Enter the value of a:");
		Scanner scanner=new Scanner(System.in);
		a=scanner.nextFloat();
		System.out.print("Enter the value of b:");
		b=scanner.nextFloat();
		sum=a+b;
		System.out.println("Sum of two numbers like a and b is: " +sum);
	}
}
