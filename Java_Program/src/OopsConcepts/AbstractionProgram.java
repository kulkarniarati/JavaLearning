package OopsConcepts;

public class AbstractionProgram { // outer class

 public static void main(String[] args) {

	AbstractionProgram a1=new AbstractionProgram();
	
	Employee t1 = a1.new Coder("Marry", "Canada", "fhh2", "Java");
	t1.work();

	Employee m2 = a1.new Manager("Peter", "Paris", "p125", "Dev & QA");
	m2.work();
	
}

	abstract class Employee { // Base class

		String name;
		String address;
		String phoneNo;

		public Employee(String name, String address, String phoneNo) {
			this.name = name;
			this.address = address;
			this.phoneNo = phoneNo;
		}

		abstract public void work();
	}

	class Coder extends Employee { // Derived class1

		String language;

		public Coder(String name, String address, String phoneNo, String language) {
			super(name, address, phoneNo);
			this.language = language;
		}

		@Override
		public void work() {
			System.out.println(name +" is in coder class");
			
		}

	}

	class Manager extends Employee { // Derived class2

		String team;

		public Manager(String name, String address, String phoneNo, String team) {
			super(name, address, phoneNo);
			this.team = team;
		}

		public void work() {
			System.out.println(name + " is in Manager class");
		}

	}
}

