package org.kedwal;
//def,10,30,60
public class encapconstchanning {

	encapconstchanning(){
		System.out.println("Default Constructor:");
	}
	encapconstchanning(int x){
		this();
		System.out.println(x);
		
	}
	encapconstchanning(int x,int y){
		this(10);
		System.out.println(x+y);
	}
	encapconstchanning(int x,int y,int z){
		this(10,20);
		System.out.println(x+y+z);
	}
	
	
	public static void main(String args[]) {
		encapconstchanning obj=new encapconstchanning(10,20,30);
}
}
