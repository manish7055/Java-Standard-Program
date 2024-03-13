class Puncutation{
public static void main(String args[]){
String str="AM#AN%K&U$M4A66R";
int count=0;
for(int i=0;i<str.length();i++)
if(!(((str.charAt(i)>='A')&&(charAt(i)<='Z')&&(charAt(i)>'a')&&(charAt(i)<'z')&&(charAt(i)>'0')&&(charAt(i)<'9'))));
count++;
System.out.prints("Puncutation:"+count);
}
}