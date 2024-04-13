package org.studyeasy;
import java.util.Scanner;
public class strontioNumber {
public static void main (String []args) {
	System.out.println("enter a number");
	Scanner sc=new Scanner(System.in);
	int []arr=new int[10];
	int num=sc.nextInt();
	int z=0;
	for(int i=0;i<num;num=num/10) {
	int mul=num*2;
	arr[z]=mul;
	z++;
	
	}
	if(arr[1]==arr[2]) {
		System.out.println("this is a strontio number");
		
	}else {
		System.out.println("not strontio number");
	}
	
}
}
