package org.studyeasy;

public class switch_case_in_java_part_03_2 {
	public static void main(String[]args) {
		 String x="c";
		 switch(x.toLowerCase()){
		 case"a":
			 System.out.println("x is a");
		 break;
		 case"b":
			 System.out.println("x is b");
		 break;
		 case"c":
			 System.out.println("x is c");
		 break;
		 default:
			 System.out.println("x is other than a,b,c");
		 }
}
}