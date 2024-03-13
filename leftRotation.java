import java.util.*;
class leftRotation{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
//System.out.println("Enter the number of Array ");
int [] arr={1,2,3,4,5,6};
System.out.println("our Array");
for(int i=0;i<arr.length;i++)
System.out.println(arr[i]+"");
System.out.println("\n How Many Time you want to rotate:");
int rotation=sc.nextInt();
int m=0;
for (int j=0;j<rotation;j++){
int temp=arr[0];
for(m=0;m<arr.length-1;m++) 
arr[m]=arr[m+1];
arr[m]=temp;

}
System.out.println("\n Rotate Array");
for(int i=0;i<arr.length;i++)
System.out.println(arr[i]+"");
}
}