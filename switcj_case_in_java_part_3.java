package org.studyeasy;

public class switcj_case_in_java_part_3 {
public static void main(String[]args) {
	 char x='h';
	 switch(Character.toLowerCase(x)){
	 case'a':
		 System.out.println("x is a");
	 break;
	 case'b':
		 System.out.println("x is b");
	 break;
	 case'c':
		 System.out.println("x is c");
	 break;
	 default:
		 System.out.println("x is other than a,b,c");
	 }
}

}
