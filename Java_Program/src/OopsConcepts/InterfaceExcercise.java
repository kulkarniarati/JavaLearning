//Interface is a collection of behaviors or trails.
package OopsConcepts;

public class InterfaceExcercise {

	public static void main(String[] args) {

		InterfaceExcercise IEx = new InterfaceExcercise();
		Programmer p1 = IEx.new Programmer();
		p1.trainings();
		p1.Employee("isha", "qa1000231");

		Manager p2 = IEx.new Manager();
		p2.trainings();
		p2.interview();
		
		//ability to take more than one form------------------------------------------->
		p2.Employee("Neha", "dev1452003");//accessing the base class variables using constructor Employee
		Employee e1=p2;
		e1.Employee("mike", "hr10023652");//BY using employee object can't access other methods/interface. Only can access the methods/constructor which is defined under employee class
		//e1.interview();//invalid,will not compile
		
		ITraining t1=p1;
		t1.trainings();
		//t1.interview();//invalid, will not compile
		//t1.employee();//invalid, will not compile
	}

	class Employee {

		String empName;
		String empID;
		
		public void Employee(String empName,String empID) {
			this.empID=empID;
			this.empName=empName;
			System.out.println("This is a employee class = " + empID +":"+ empName);
		}
		
	}

	class Programmer extends Employee implements ITraining {

		public void Employee(String empName, String empID) {
			// TODO Auto-generated method stub
			super.Employee(empName, empID);
		}
		
		@Override
		public void trainings() {
			System.out.println(a);
			System.out.println(b);
			System.out.println("Programmer can attend trainings");
		}

	}

	class Manager extends Employee implements ITraining, Iinterview {

		@Override
		public void interview() {

			System.out.println("Manager can conduct interviews");
		}

		@Override
		public void trainings() {

			System.out.println("Manager can attend trainings");
		}

	}

	interface ITraining {
		public static int a = 0;
		int b = 1;

		void trainings();
	}

	interface Iinterview {
		void interview();
	}

}
