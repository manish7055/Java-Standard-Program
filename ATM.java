import java.util.Scanner;
class ATM{
static Scanner sc=new Scanner(System.in);
static int amount=10000;
public static void cashDeposit(){

System.out.println("Enter amount");
int dep= sc.nextInt();
amount=amount+dep;
System.out.println("Deposit sucess!");

}
public static void cashWith(){
System.out.println("Enter amount");
int am = sc.nextInt();
if(am<amount){
amount=amount-am;
System.out.println("Withdrawl Success");

}else
System.out.println("Insufficient Balance");

}
public static void Inquiry(){
System.out.println("Amount is:"+amount);

}

public static void main(String args[]){
while(true){
System.out.println("ATM Program");
System.out.println("1.Deposit\n2.Withdrawl\n3.Inquiry\n4.Exit\n Enter choice:");
int choice=sc.nextInt();
switch(choice){

case 1:
cashDeposit();
break;
case 2:
cashWith();
break;
case 3:
Inquiry();
break;
default:System.exit(0);
}
}
}
}