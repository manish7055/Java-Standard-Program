//WAP to insertion search 

package org.studyeasy;
public class array_part_01 {
public static void main(String args []) {
	int a[] = {5,1,9,3,6};
	int temp;
	for(int i=0; i<4; i++) {
		for(int j=0;j<4;j++)
		if (a[j]>a[j+1]) {
			temp=a[j];
			a[j]=a[j+1];
			a[j+1]=temp;
		}
	}
	System.out.println("sorte array");
	for(int i=0;i<5;i++) {
		System.out.print(a[i]);
	}
}
}
