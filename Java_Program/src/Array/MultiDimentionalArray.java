package Array;

import java.util.Scanner;

public class MultiDimentionalArray {

	public static int i,j;
	
//***********************************************************	
	public void multiDimentional() {//MatrixArray
		/*
		 *  101
		 *  110 
		 *  011
		 */
		//Declare & Initialize matrix array
		int[][] array= {
				{1 , 0 , 1},
				{1 , 1 , 0},
				{0 , 1 , 1}
		};
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				System.out.print(array[j][i] +" ");
			}
			System.out.println();
		}
	}
	
//****************************************************************	
	public void exceptionScenario() {//ArrayIndexOutOfBoundException
		int [] expArray= {1,3,4,77,89};
		System.out.println(expArray[6]);
	}
	
//*****************************************************************
	public void userInput() {//RunTime array Initialization 
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number:  ");

		int arraySize=scanner.nextInt();		
		int[] array=new int[arraySize];
		System.out.println("the length of an array is: " +array.length);
	}
	
//*****************************************************************
	
	
	public static void main(String[] args) {
		MultiDimentionalArray arr=new MultiDimentionalArray();
		arr.multiDimentional();
		arr.userInput();
		arr.exceptionScenario();
	
	}

}
