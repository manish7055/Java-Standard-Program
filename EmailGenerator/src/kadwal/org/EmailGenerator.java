package kadwal.org;
import java.util.Random;
public class EmailGenerator {
public static void main(String args[]) {
String originalEmail="kedwalmanish82334";
for(int i=0; i<1000;i++) {
	 String newEmail = generateRandomDots(originalEmail);
	 System.out.println(newEmail);
	 
}
}
public static String generateRandomDots(String originalEmail) {
	String Builder modifieEmail=new String Builder(originalEmail);
 
	Random random=new Random();
	int numDots=random.nextInt(5)+1;
	for (int i=0;i<numDots;i++) {
		int position=random.nextInt(modifiedEmail.length()-1)+1;
		if(modifiedEmail.charAt(position-1)!='.')&&(modifiedEmail.charAt(position)!='.'))modifiedEmail.insert(position,'.');
		
	}
	return modifiedEmail.toString()+"@gmail.com";
}
}
