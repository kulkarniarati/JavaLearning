package MultipleInheritance;

public interface Instructor {

	int workingHours=9;
	void work();
	
	default void singing() {
		System.out.println("Instructor like to sing a song");
	}
	
	static void picnic() {
		System.out.println("Instructor is ready to go picnic");
	}
}
