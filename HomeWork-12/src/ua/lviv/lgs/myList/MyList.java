package ua.lviv.lgs.myList;

import java.util.Arrays;

public class  MyList {
	private int[] myArray;
	
	
	public MyList () {
		 myArray = new int [0];
	}
	
	
	public void add(int e) {
		
	    int[]tempArray =  myArray;
		myArray =   new int [myArray.length + 1];
		System.arraycopy(tempArray, 0, myArray, 0, tempArray.length);
		myArray[myArray.length - 1] = e;				
	}
	public void remove(int index) {		
		int[]tempArray = myArray;
		myArray = new int [myArray.length - 1];
		System.arraycopy(tempArray, 0, myArray, 0, index );
		System.arraycopy(tempArray, index +1, myArray, index, tempArray.length - index - 1);
	}
	

	public int[] getMyArray() {
		return myArray;
	}

	public void setMyArray(int[] myArray) {
		this.myArray = myArray;
	}

	@Override
	public String toString() {
		return "MyList [myArray=" + Arrays.toString(myArray) + "]";
	}
	
	

}
