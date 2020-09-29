package InterfaceDefaultMethod;

public interface ITimeService {

		void printDate(int day, int month, int year);
		
		void printTime(int hours, int minutes, int seconds);
		
		default void printWeekDay(String day) {
			System.out.println("Day= " +day);
		}
}
