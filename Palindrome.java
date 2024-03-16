 class Palindrome{
	public static void main(String args[]){
		String str = "MADAM";
		String  temp=" ";
		for(int i=str.length()-1; i>=0;i--){
			temp=temp+str.charAt(i);
	}
	if(temp.equals(str))
		System.out.println("palindrome");
	else 
		System.out.println(" not palindrome");
}
}
	