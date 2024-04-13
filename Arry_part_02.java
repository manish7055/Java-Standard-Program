// WAP  too delete a value from array
package org.studyeasy;

public class Arry_part_02 {
public static void main (String args[]) {
	int []a= {3,9,7,4,5};
	int size=5;
	int del=9;
	for(int i=0;i<size-2;i++) {
	if(a[i]==del) {
		for(int j=1;j<4;j++)
			a[j]=a[j+1];
		size=size-1;
		
	}
}
	System.out.println("new array");
	for(int i=0;i<size;i++)
	System.out.print(a[i]);
	System.out.println();
	
}
}