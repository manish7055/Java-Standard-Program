import java.util.Scanner;
class inputNaturalNumber{
public static void main (String [] args){
Scanner input=new Scanner(System.in);
int num=input.nextInt();
for(int i=1;i<=num;i++){
num=num+i;
}
System.out.println(num);
}
}