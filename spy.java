import java.util.*;
class spy{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
int num= sc.nextInt();
int mul=1;
int add=0;
for(int i=0;i<num;num=num/10){
int rem=num%10;
add=add+rem;
mul= mul*rem;

}
if (add==mul)
System.out.println("spy number");
else
System.out.println("not spy number");


}
}