package org.studyeasy;

import java.util.Scanner;

public class Emrip {
public static void main (String args[]) {
	Scanner sc=new Scanner (System.in);
	System.out.println("enter a number");
	int num=sc.nextInt();
	if(Integer.bitCount(num)%2==0) {
		System.out.println(num+"is an evil number");
	}else {
		System.out.println(num+"is not evil number");
	}
}
}
