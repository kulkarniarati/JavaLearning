
public class ParameterisedConstructor {

	String name;

	
	  public ParameterisedConstructor(String name) {
	  this.name=name;
	  System.out.print(name); }
	 
	
	public void empDetails(String name) {
		System.out.println(name);
	
		
	}
	
	  public static void main(String[] args) { // TODO Auto-generated method stub
	  
	  ParameterisedConstructor c1=new ParameterisedConstructor("Arati");
	  ParameterisedConstructor c2=new ParameterisedConstructor("Kulkarni");
	  c1.empDetails("pizza");
	  c2.empDetails("pasta");
	
	 
	
			
	}

}
