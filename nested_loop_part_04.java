package org.studyeasy;

public class nested_loop_part_04 {
public static void main(String args[]) {
	for(int i=65;i<=69;i++) {
		for (int j=65;j<=i;j++)  
			System.out.printf("%c",i);
		System.out.println();
	}
}
}
