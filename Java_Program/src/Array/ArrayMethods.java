package Array;

import java.util.Arrays;

public class ArrayMethods {
	public static int c,d,x;
	public void ArrayMeth() {
		String[] str = { "USA", "Canada", "Bali", "France", "Dubai" };
		// Copying an Array
		System.out.println("Copying array Elements");
		String[] strCopy = Arrays.copyOf(str, str.length);
		for (String prt : strCopy)// This for loop is used to print an array values
			System.out.println(prt);
		
		
		// Sorting an Array alphabetically by default
		System.out.println("Sorting String Values");
		Arrays.sort(str);
		for (String prt : str)
			System.out.println(prt);

		//Sorting an integer values in ascending order by default
		System.out.println("Sorting Interger values");
		int[] i= {3,67,90,33,42,1,0};
		Arrays.sort(i);
		for(int j : i)
			System.out.println(j);
		
		//Searching
		System.out.println("binary Searching");
		int[] searchArray= {1,2,3,4,5,6};
		int key=4;
		System.out.println(key +"is at location of" + Arrays.binarySearch(searchArray, key));
		
		/*
		 * //Linear searching System.out.println("Linear searching"); for(int
		 * l=0;l<searchArray.length;l++) { if(searchArray[l]==key) {
		 * System.out.println(key + "is at location of" +
		 * Arrays.binarySearch(searchArray, key)); return l; } } return -1;
		 */	
		
	}
	
	public static void compareArrays() {
		//Comparing an array elements
		int[] arr1= new int[] {11,22};
		int[] arr2= new int[] {11};
		int[] arr3=new int[] {11,22};
		boolean comp=Arrays.equals(arr1, arr3);		
		System.out.println(comp);		
	}

	public static void main(String[] args) {

		ArrayMethods obj = new ArrayMethods();
		//obj.ArrayMeth();
		ArrayMethods.compareArrays();
	}

}
