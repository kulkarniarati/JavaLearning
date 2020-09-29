//Runtime polymorphism
//Method Overriding always used in inheritance program , here derived class can override the base class.
package OopsConcepts;

public class Polymorphism_MethodOverriding {

 public static void main(String[] args) {

	 Polymorphism_MethodOverriding prog=new Polymorphism_MethodOverriding();
	 
	 
	 Coder c1=prog.new Coder("david", "blog12", "1235698745", "C#");
	 c1.work();// invokes method of coder class
	 
	 Employee e1=c1;
	 e1.work();// invokes method of coder class 
	 
	 Manager m1=prog.new Manager("gouliya", "DisuzaPlot12", "25555563", "20");
	 m1.work();
	 Employee e2=m1;//Invokes manager class method 
	 e2.work();//Invokes manager class method
	 
	 Employee e3=prog.new Employee("", "", "");
	 e3.work();//invokes base class method
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

		
		  public void work() {
		  System.out.println("I am a coder, writing the code using java"); }
		 
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
