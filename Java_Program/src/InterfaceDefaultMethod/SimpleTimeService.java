package InterfaceDefaultMethod;

public class SimpleTimeService implements ITimeService{

	@Override
	public void printDate(int day, int month, int year) {
		System.out.println("Date= "+day+ "/" +month+ "/" +year);
		
	}

	@Override
	public void printTime(int hours, int minutes, int seconds) {
		System.out.println("Time= " +hours+ ":" +minutes+  ":" +seconds);
		
	}

}
