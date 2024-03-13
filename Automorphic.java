 class Automorphic{
 public static void main(String args[]){
 int num=33;
 int sq= num*num;
 int flag=1;
 while(num>0){
 if(sq%10!=num%10){
 flag=0;
 break;
 }
 sq=sq/10;
 num=num/10;
 }
 if(flag==1){
 System.out.println("Automorphic");
 
 }else
 System.out.println("not Automorphic");
 }
 
 
 }