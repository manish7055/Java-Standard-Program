package org.studyeasy;

public class add_digits_number {
public static void main(String[]args) {
	int sum=0;
	int num=787;
	int rem;
	for(int i=0; i<num; num=num/100) {
		rem=num%10;
		sum=sum+rem;
		System.out.println(sum);
	}
}
}
  //Hello