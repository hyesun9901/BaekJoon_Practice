import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws Exception, IOException {
		Scanner scanner = new Scanner(System.in);
		int A = 0;
		A = scanner.nextInt();
		int tmp=0;
		ArrayList<Integer> array = new ArrayList<>();
		for(int i=0;i<A;i++) {
			tmp=scanner.nextInt();
			array.add(tmp);
		}
		Collections.sort(array);
		System.out.println(array.get(0)+" "+array.get(A-1));
		scanner.close();
	}
}
