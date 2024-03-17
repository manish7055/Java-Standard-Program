class practice3{
public static void main(String args[]){
String str="AMAN KUMAR";
int count=0;
char ch='M';

for(int i=0; i<str.length();i++){
if(ch==str.charAt(i))
count++;
}
System.out.println(count);
}
}