package kedwal.org;

import java.util.Scanner;

public class calculator {
public static void main(String []args) {
	System.out.println("+,-,*,/");
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the first number");
	int a=sc.nextInt();
	System.out.println("Enter the second number");
	int b=sc.nextInt();
	System.out.println("enter the number of  oprator ");
	int op=sc.nextInt();
	switch(op) {
	case 1:
		System.out.println(a+b);
		break;
	case 2:
		System.out.println(a-b);
		break;
	case 3:
		System.out.println(a*b);
		break;
	case 4:
		System.out.println(a/b);
		break;
		default:
			System.out.println("invalid key");
	
	}
	
}
}
