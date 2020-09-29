
public class MultiConstructor {

	String name;
	int a,b,i;
	
	public MultiConstructor() {
		System.out.println("No parameterised");
	}
	
	public MultiConstructor(int a) {
		this.a=a;
		System.out.println("Integer value=" +a);
	}
	
	public MultiConstructor(int b,String name) {
		System.out.println("Int+String value=" +b +" " +name);
	}
	
	public void sampleMethod(String name) {
		System.out.println("Method:- " +name);
	}
}

