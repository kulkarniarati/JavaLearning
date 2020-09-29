package MultipleInheritance;

public class Manager implements Employee,Instructor {

//**************************duplicate constant variables in interface=allowed**********************************
	public Manager() {
		///System.out.println(workingHours);// its showing an error as the field workingHours is ambiguous. So need to call this field using interface name
		System.out.println(Employee.workingHours);
		System.out.println(Instructor.workingHours);
		
	}

//*****************************duplicate Abstract methods=allowed************************************	
	@Override
	public void work() {
		System.out.println("hello");
	}
	
	
//*******************************duplicate default method=NOT allowed************************************	
	/*///////This code shows an error as duplicate method overriden not allowed
	 * @Override public void singing() { // TODO Auto-generated method stub
	 * Instructor.super.singing(); }
	 * 
	 * @Override public void singing() { // TODO Auto-generated method stub
	 * Employee.super.singing(); }
	 */	
	
	//alternative Solution is :-
	@Override
	public void singing() {
		System.out.println("Employye and instructor both likes to sing a song");
	}
	
	
//***************************************duplicate static method=allowed************************************
	public void printStaticblock() {
		Employee.picnic();
		Instructor.picnic();
	}

	
//main program
	public static void main(String[] args) {
		Manager mgr=new Manager();
		mgr.work();
		mgr.singing();
		mgr.printStaticblock();
	}

}
