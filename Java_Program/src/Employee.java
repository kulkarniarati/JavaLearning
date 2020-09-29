
public class Employee {

		String name;
		int age;

		public Employee(String name, int age) {
			this.name=name;
			this.age=age;
		}
		
		public void greet(){
			System.out.println("Hello Good Morning said by " +name+ " who having age of " +age);
		}

		public void work(){
			System.out.println("hard worker " +name+ " having age of " +age);
		}
	}

