class practice{
public static void main(String args[]){
String str ="Ram is A gooD Boy";
String temp=" ";

for(int a=0;a<str.length();a++){
if((str.charAt(a)>=65)&&(str.charAt(a)<=90))
 temp=temp+((char)(str.charAt(a)+32));
else
	if((str.charAt(a)>=90)&&(str.charAt(a)<=122))
		temp=temp+((char)(str.charAt(a)-32));
	else
		temp= temp+str.charAt(a);

}
System.out.println(str);
System.out.println("String"+temp);

}

}