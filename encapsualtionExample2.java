package org.kedwal;

public class encapsualtionExample2 {
	int id;
	String name;
	String lname;
	static int salary=30000;
	static String cname="TCS";
	void store(int id1,String name1,String lname1) {
		id=id1;
		name=name1;
		
		
	}
	void display() {
		System.out.println("Id Name:"+id);
		System.out.println("Name is:"+name);
		System.out.println("Last name:"+name);
		System.out.println("Salary:"+salary);
		System.out.println("Company Name:"+cname);
	}
	
public static void main(String args[]) {
	encapsualtionExample2 obj1=new encapsualtionExample2();
	obj1.store(1,"manish","kedwal");
	obj1.display();
	System.out.println("---------------------------"+"\n");
	encapsualtionExample2 obj2=new encapsualtionExample2();
	obj2.store(2,"vikas","saini");
	obj2.display();
}
}
