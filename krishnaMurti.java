import java.util.Scanner;
class KrishnaMurti{
public static  int fact(int n){
int f=1;
for(int i=1;i<=n;i++)
f=f*i;
return f;
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int sum=0;
int temp=num;
for(int m=0;m<num;num=num/10)
sum=sum+fact(num%10);

if(sum==temp)
System.out.println("krishnaMurti");
else 
System.out.println("not krishnaMurti number");

}
}