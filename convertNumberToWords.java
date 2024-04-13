 package org.studyeasy;
import java.util.Scanner;
public class convertNumberToWords {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int num=sc.nextInt();
	if(num<1||num>999) {
		System.out.println("number is invalid");
		
	}
	else {
		int a=num%10;
		int b=(num/10)%10;
		int c=(num/100)%10;
		String A[]= {"","one","two","three","four","five","six","seven","Eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","Eigthteen","nineteen"};
	String B[]= {"","","twenty","Thirty","fourty","fifty","sixty","seventy","eigthy","ninety"};
	String C[]= {"hundred"};
	if(num>=1&&num<=19) {
		System.out.println(A[num]);
	}else if(num>=20&&num<=99) {
		System.out.println(B[b]+""+A[a]);
		
	}else if(num>=100&&num<=999) {
		System.out.println(A[c]+""+C+""+B[b]+""+A[a]);
	}
	
	}
}
}
