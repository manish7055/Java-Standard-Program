package org.studyeasy;

public class revers_number {
public static void main(String[]args) {
	int sum=0;
	int num=789;
	int rem;
	for(int i=0;i<num;num=num/10) {
		rem=num%10;
		sum=rem;
	}
	System.out.println(sum);
}
}
