package ua.lviv.lgs.myList;

public class ApplicationMyList {
	public static void main(String[] args) {
	
	MyList ar = new MyList();
	ar.add(1);
	ar.add(2);
	ar.add(3);
	ar.add(4);
	System.out.println(ar);
	ar.remove(2);
	System.out.println(ar);
	ar.add(5);
	System.out.println(ar);
	ar.remove(1);
	System.out.println(ar);
	
	

	
	}
}
