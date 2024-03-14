// Autobiographical Number
// 1210
// 0123
class AutobiographicalNumber{
	public static void main(String[] args){
		String num = "1210";
		int arr[] = new int[num.length()];
		for(int i=0;i<num.length();i++){
			int count=0;
			for(int j=0;j<num.length();j++){
				if((i+48)==(int)num.charAt(j))
					count++;
			}
			arr[i]=count;
		}
		int flag=1;
		for(int i=0;i<num.length();i++)
			if((arr[i]+48)!=(int)num.charAt(i))
				flag=0;
		if(flag==1)
			System.out.print("Auto biographical");
		else
			System.out.print("Not Auto biographical");
	}
}