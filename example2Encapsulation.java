package org.kedwal;

public class example2Encapsulation {
int rollNumber;
int fees;
String name;
String village;
void store(int rollNumber1,int fees1,String name1,String village1) {
	rollNumber=rollNumber1;
	fees=fees1;
	name=name1;
	village=village1;
}
void display() {
	System.out.println("Roll Number :"+rollNumber);
	System.out.println("fees :"+fees);
	System.out.println("Name :"+name);
	System.out.println("village :"+village);
}
public static void main (String []args) {
	example2Encapsulation obj1=new example2Encapsulation();
	obj1.store(1,500,"ankus","muktyarpurNawada");
	obj1.display();
	example2Encapsulation obj2=new example2Encapsulation();
	obj2.store(2,400,"ans","gajrola");
	obj2.display();
	example2Encapsulation obj3=new example2Encapsulation();
	obj3.store(3,300,"himanshu","amroha");
	obj3.display();
	example2Encapsulation obj4=new example2Encapsulation();
	obj4.store(4,200,"Happy","kanth");
	obj4.display();
	
}
}
