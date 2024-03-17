import java.util.Scanner;
class practice4{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Type a String ");
String str=sc.next();
String temp="";
for(int i=str.length()-1;i>=0;i--){
temp=temp+str.charAt(i);

}
if(str.equals(temp))
System.out.println("String is palindrome");
else
System.out.println("  String is not palindrome");
}
}