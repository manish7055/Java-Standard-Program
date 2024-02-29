import java.util.Scanner;
class Duck{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("Etner a number");
int num= sc.nextInt();
 int flag=0;
for(int i=0;i<num;num=num/10)
if(num%10==0)
flag=1;

if(flag==1)
System.out.println("duck number");
else
System.out.println("not duck number");




}
}