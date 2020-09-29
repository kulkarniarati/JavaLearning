package InterfaceDefaultMethod;

public class MainProgram {

	public static void main(String[] args) {
		SimpleTimeService st=new SimpleTimeService();
		st.printDate(12, 12, 2017);
		st.printTime(9, 45, 20);
		st.printWeekDay("Tuesday");
		
		
		

		//AnotherTimeService ats=new AnotherTimeService();
		//ats.printWeekDay("Monday");
	}

}
