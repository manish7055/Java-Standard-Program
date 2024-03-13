class Alternate{
public static  boolean prime(int n){
for(int j=2;j<=n/2;j++)
if (n%j==0)
return false;
return true;
}
public static void main(String[] args){
int m=2;
for(int i=2;i<=50;i++){
if(prime(i))
if(m%2==0){
System .out.println(i+"");
m=m+1;
}
else 
m=m+1;
}
}
}
