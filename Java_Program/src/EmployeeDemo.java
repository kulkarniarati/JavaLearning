
public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		//create object for emp1
		Employee emp1=new Employee("Joe",24);
		//create object for emp2
		Employee emp2=new Employee("mike",28);
		//ask for greet
		emp1.greet();
		emp2.greet();
		//ask for work
		emp1.work();
		emp2.work();
	}

}
