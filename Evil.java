import java.util.Scanner;
class Evil{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int count=0;
for(int i=0;i<num;num=num/2){
if(num%2==1)
count++;
if(count%2==0)
System.out.println("Evil number");
else
System.out.println("not Evil number");
}
}
}