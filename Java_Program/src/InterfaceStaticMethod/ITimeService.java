package InterfaceStaticMethod;

public interface ITimeService {

	int workingDaysInWeek=5;
		
	void printTime(int hours, int minutes, int seconds);
	
	default void printWeekDay(String day) {
		System.out.println("Day= " +day);
	}
	
	static void weeklyOff(String weekOff) {
		System.out.println("Weekly Off on= " +weekOff);
	}
}
