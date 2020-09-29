package MultipleInheritance;

public interface Employee {

	int workingHours=7;
	void work();
	
	default void singing() {
		System.out.println("employee like to sing a song");
	}
	
	static void picnic() {
		System.out.println("Employee is ready to go picnic");
	}
}
