package kedwal.org;
import java.util.*;
public class secondDimnsionalArray {
public static void main(String args[]) {
	
int [][][]arr={{{1,2,3},{4,2,5},{6,7,8}}};
for(int[][]row1:arr) {
for(int[] row: row1) {
	for(int value:row) {
		
System.out.print(value);
}
}
}}}