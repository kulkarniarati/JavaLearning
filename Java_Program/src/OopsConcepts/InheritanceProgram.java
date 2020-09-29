package OopsConcepts;

public class InheritanceProgram { // outer class

 public static void main(String[] args) {

	// Employee base class is the inner class of InheritanceProgram class, so need
	// to create first object of outer class and then create object of inner class
	// by
	// Referring outer class object.
	InheritanceProgram i = new InheritanceProgram();

	// we can create an object like this as well- Coder t1 = i.new Coder("Marry",
	// "Canada", "fhh2", "Java");
	Employee t1 = i.new Coder("Marry", "Canada", "fhh2", "Java");
	t1.work();

	// Manager m2 = i.new Manager("Peter", "Paris", "p125", "Dev & QA");
	Employee m2 = i.new Manager("Peter", "Paris", "p125", "Dev & QA");
	m2.work();
}

	class Employee { // Base class

		String name;
		String address;
		String phoneNo;

		public Employee(String name, String address, String phoneNo) {
			this.name = name;
			this.address = address;
			this.phoneNo = phoneNo;
		}

		public void work() {
			System.out.println("I am employee, working in software company");
		}
	}

	class Coder extends Employee { // Derived class1

		String language;

		public Coder(String name, String address, String phoneNo, String language) {
			super(name, address, phoneNo);
			this.language = language;
		}

		/*
		 * public void work() {
		 * System.out.println("I am a coder, writing the code using java"); }
		 */
	}

	class Manager extends Employee { // Derived class2

		String team;

		public Manager(String name, String address, String phoneNo, String team) {
			super(name, address, phoneNo);
			this.team = team;
		}

		public void work() {
			System.out.println("I am a Manager, handling the multiple teams");
		}

	}
}
