package InterfaceDefaultMethod;

public class AnotherTimeService implements ITimeService {

	@Override
	public void printDate(int day, int month, int year) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printTime(int hours, int minutes, int seconds) {
		// TODO Auto-generated method stub
		
	}
	
	 public void printWeekDay(String day) {
		System.out.println("Day= " +day);
	}
	
}
