import java.util.Scanner;
class emripNumber{
public static   boolean prime(int n){
for(int i=0; i<=n/2;i++)
if(n/2==0)
return false;
return false;

}
public static int Reverse(int n){
int sum=0;
for(int i=0;i<n;n=n/10)
sum=sum*10+n/10;
return sum;

}
public static void main(String args[]){
Scanner sc= new Scanner (System.in);
System.out.println("enter the number");
int num= sc.nextInt();
if(prime(num)&&prime(Reverse(num)))
System.out.println("Emrip"); 
else 
System.out.println("not Emrip");

}
}