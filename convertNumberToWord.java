import java.util.*;
class convertNumberToWord{

public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("Enter a number");
int number= sc.nextInt();
if(number<1||number>999){
System.out.println("invalid number");
}else{ 
int a=number%10;
int b=(number/10)%10;
int c=(number/100)%10;
String A[]={"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
String B[]={"","","twenty","thirty","fourty","fifty","sixty","seventy","eigthy","ninety"};
String C = "Hundred";
if(number>=1&&number<=19){
	System.out.println(A[number]);
}
else if(number>=20&&number<=99){
System.out.println(B[b]+""+A[a]);
}else if(number>=100&&number<=999){
System.out.print(A[c]+""+C+""+B[b]+""+A[a]);
}}

}
}