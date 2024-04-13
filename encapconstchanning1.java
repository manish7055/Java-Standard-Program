package org.kedwal;
//default,60,30,10
public class encapconstchanning1 {
	encapconstchanning1(){
		System.out.println("Defalt value");
		
		}
	encapconstchanning1(int x){
		this(10,20);
		System.out.println(x);
	}
	encapconstchanning1(int x,int y){
		this(10,20,30);
		System.out.println(x+y);
	}
	encapconstchanning1(int x,int y,int z){
		this();
		System.out.println(x+y+z);
	}
public static void main(String []args) {
	encapconstchanning1 obj=new encapconstchanning1(10);
	
}
}
