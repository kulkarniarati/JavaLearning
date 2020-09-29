import java.util.Scanner;

public class IfElseNestedStatements {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int x=scanner.nextInt();
		
		if(x==10) {
			System.out.println("correct Ans");
		}else {
			System.out.println("Looser");
		}
	}
}
 