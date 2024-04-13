package org.kedwal;

public class exampleOfEncapsulation {
int id;
String name;
int salary;
String cname;
void store(int id1,String name1,int salary1,String cname1) {
	id=id1;
	name=name1;
	salary=salary1;
	cname=cname1;
}
void Display() {
	System.out.println("id :"+id);
	System.out.println("name :"+name);
	System.out.println("salary :"+salary);
	System.out.println("cname :"+cname);
}
public static void main(String []args) {
	exampleOfEncapsulation obj1=new exampleOfEncapsulation();
	obj1.store(1,"manish",12000,"Tcs");
	obj1.Display();
	exampleOfEncapsulation obj2=new exampleOfEncapsulation();
	obj2.store(2,"vikas",13000,"Tcs");
	obj2.Display();
	exampleOfEncapsulation obj3=new exampleOfEncapsulation();
	obj3.store(3,"sohit",14000,"Tcs");
	obj3.Display();
	exampleOfEncapsulation obj4=new exampleOfEncapsulation();
	obj4.store(4,"rahul",15000,"Tcs");
	obj4.Display();
}
}
