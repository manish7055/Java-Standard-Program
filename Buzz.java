import java.util.Scanner;
class Buzz{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("Enter a number");
int num= sc.nextInt();
 if( (num%7==0)&&(num%10==7))
System.out.println("buzz number");
 else
 System.out.println("not buzz");


}
}