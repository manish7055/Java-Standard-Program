package org.studyeasy;
import java.util.Scanner;
public class smithNumber {
	public static int sum(int n) {
		int sum=0;
		for(int i=0; i<n;n=n/10) 
			sum= sum+n%10;
		return sum;
		
	}
public static void main (String []args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("enter a number");
	int num=sc.nextInt();
	int temp=num;
	int[] arr=new int[10];
	int m=0;
	for(int i=2;i<=num;) {
		
		if(num%i==0) {
			arr[m]=i;
			m=m+1;
			num=num/i;
			i=2;
		}else {
			i=i+1;
		}
	}
	int numDigit=smithNumber.sum(temp);
	int factorDigit=0;
	for(int j=0;j<m;j++) {
		factorDigit=factorDigit+smithNumber.sum(arr[j]);		
	}
	if(factorDigit==numDigit)
		System.out.println("smith number");
	else 
		System.out.println("not smith number");
	
}
}
