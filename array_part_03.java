//WAP to find greatest value in java

package org.studyeasy;

public class array_part_03 {
	public static void main(String args []) {
		int []arr= {3,7,9,11,2};
		int max=arr[0];
		for (int i=0; i<=4;i++) {
			if (max<arr[i]) {
				max=arr[i];
				System.out.print("greatest value of :"+max);
				System.out.println();
			}
		} 
	}
}
