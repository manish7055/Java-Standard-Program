class stringCheck{
public static void main(String args[]){
	String str="manish kedwal";
	char ch='a';
	int temp=0;
	for(int i=0;i<str.length();i++){
		if(ch==str.charAt(i))
			temp++;
	}
		System.out.print(temp);
}
}