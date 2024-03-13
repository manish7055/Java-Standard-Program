class factorial{
public static void main(String args []){
int num= 145;
int temp= num;
int sum=0;
for(int i=0; i<num;num=num/10){
int rem=num%10;
sum=sum+factorial(rem);

}
if(sum==temp)
System.out.print("peterson number!");
else 
System.out.println("not peterson number");
}
static int factorial(int n){
int fact=1;
for(int i=1;i<=n;i++){
fact=fact*i;
}
return fact;

}

}