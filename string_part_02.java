//WAP to convert small to capital and capital to small value 

package org.studyeasy;

public class string_part_02 {
public static void main(String args []) {
	String a="manish kedwal";
	for (int i=0;i<a.length();i++) {
		if((int)a.charAt(i)>=65&&((int)a.charAt(i)<=90))
		System.out.printf("%c",(int)a.charAt(i)+32);
		else 
			if((int)a.charAt(i)>=97&&((int)a.charAt(i)<=122))
 System.out.printf("%c",(int)a.charAt(i)-32);			
	else
		System.out.printf("%c",(int)a.charAt(i));
}
}
}