import java.util.Scanner;
class fibonacciSeries{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Number");
int num=sc.nextInt();
int firstNum=0;
int secondNum=1;
	System.out.println(firstNum+""+secondNum+"");
	for(int i=0;i<num;i++){
	int newNum=firstNum+secondNum;
	System.out.println(newNum+"");
	firstNum=secondNum;
	secondNum=newNum;
	}
}
}


