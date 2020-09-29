import java.util.Scanner;

//Write a program using switch statement to find no. of days in a month by leap year or not?

public class Switch_Statements {

	public static void main(String[] args) {
		
		int month,year;
		
		System.out.println("1.Jan  2.Feb  4.April");
		
		int[] days= {31,28,31,30,31,30,31,31,30,31,30,31};
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("ENter the month number: ");
		month=scanner.nextInt();
		
		if(month!=2) {
			System.out.println(days[month-1]);
		}else {
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the year: ");
			year=scan.nextInt();
			
			if(isLeapYear(year)!=true) 
				System.out.println(days[1]);
			else
				System.out.println("29");
	
		}
	}

	public static boolean isLeapYear(int year){
		
		if(year%4==0) {
			System.out.println("This is a leap year" );
			return true;
		}
		else {
			return false;
		}
	    }
	}

