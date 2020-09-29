import java.util.Scanner;

//Break and Continue program
public class BreakAndContinueStatements {

	String string="I am very very much lucky person as well as happy person";
	public static char c;
	public static int i;
	int counter=0;
	
	public void BreakStatement() {
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i)==c) {
				System.out.println(c + " Character is found ");
				counter++;
				break;
			}else {
			//	System.out.println(c + " character does not exist");
			}
		}
		System.out.println("Found number of times=" +counter);
	}
	
	public void ContinueStatement() {
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i)==c) {
				System.out.println(c + " Character is found ");
				counter++;
				continue;
			}else {
				//System.out.println(c + " character does not exist");
			}
		}
		System.out.println("Found number of times=" +counter);
	}
	
	public static void main(String[] args) {
		BreakAndContinueStatements br=new BreakAndContinueStatements();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a character to be search from given string:");
		c=scanner.next().charAt(i);
		
		br.BreakStatement();
		br.ContinueStatement();
	}
}
