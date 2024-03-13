class fascinating{
public static void main(String args[]){
int num=192;
String str=""+num*1+num*2+num*3;
int count=0;
for(int i=1;i<=9;i++) 
for(int j=0;j<str.length();j++)
if((int)str.charAt(j)==(i+48)){
count++;
break;
}
if(count==9)
System.out.println("Fascinating number");
else
System.out.println(" Not fascinating nunber");

}
}