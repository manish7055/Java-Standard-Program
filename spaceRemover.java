class spaceRemover{
public static void main(String args[]){
String str="Ram is a good boy";
int count=0;
for(int i=0;i<str.length();i++){
if(str.charAt(i)!=' '){
count++;
}
}
System.out.println(count);
}
}