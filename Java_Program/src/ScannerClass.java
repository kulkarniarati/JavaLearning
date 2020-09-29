import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		
		String name;
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter the name:");
		name=scanner.next();
		System.out.println("name is :" +name);

	}

}
