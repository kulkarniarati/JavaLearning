package InterfaceStaticMethod;

public class MainProgram {

	public static void main(String[] args) {
		
		//there are two ways-
		//One is---
		SimpleTimeService st=new SimpleTimeService();
		st.printTime(7, 20, 50);
		st.printWeekDay("Tuesday");
		
		//Another is---
		ITimeService its=new SimpleTimeService();
		its.printTime(10, 05, 30);
		its.printWeekDay("Friday");
		
		//its.weeklyOff("Sunday");//..... this is invalid, can not call static method using interface object.
		//SimpleTimeService.weeklyOff("Sunday");//..... this is invalid, can not call static method by inherited class.
		
		//Only one way to call static method of interface
		ITimeService.weeklyOff("Sunday");
	}

}
