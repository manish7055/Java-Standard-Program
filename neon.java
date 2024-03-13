class neon{
public static void main(String args[]){
int a=9;
int num=a*a;
int sum=0;
for(int i=1;i<num;num=num/10){
int rem=num%10;
sum=sum+rem;
}
if(sum==a)
System.out.println("Neon number");
else  
System.out.println("not neon number ");

}
}