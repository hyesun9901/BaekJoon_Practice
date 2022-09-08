import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws Exception, IOException {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> array=new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			array.add(scanner.nextInt()%42);
		}
		HashSet<Integer> arr1 = new HashSet<Integer>(array); 
		HashSet<Integer> arr2 = new HashSet<Integer>(arr1);
		System.out.println(arr2.size());
		scanner.close();
	}
}
