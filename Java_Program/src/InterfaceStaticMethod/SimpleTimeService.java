package InterfaceStaticMethod;

public class SimpleTimeService implements ITimeService {

	@Override
	public void printTime(int hours, int minutes, int seconds) {
		System.out.println("Time= " +hours+ ":" +minutes+  ":" +seconds);
		
	}

}
