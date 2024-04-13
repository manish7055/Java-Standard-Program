package org.kedwal;

public class encapconstchanning2 {
	encapconstchanning2(){
	this(10);
		System.out.println("default value");
		
	}
	encapconstchanning2(int x){
		this(10,20);
		System.out.println(x);
		
	}
	encapconstchanning2(int x,int y){
	
		System.out.println(x+y);
		
	}
	encapconstchanning2(int x,int y,int z){
		this();
		System.out.println(x+y+z);
	}
	
public static void main(String args[]) {
	encapconstchanning2 obj=new encapconstchanning2(10,20,30);
}
}
