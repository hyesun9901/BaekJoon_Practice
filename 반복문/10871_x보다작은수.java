import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws Exception, IOException {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int X = scanner.nextInt();
		int A;
		String result="";
		for(int i=0;i<N;i++) {
			A=scanner.nextInt();
			if(X>A) {
				result+=A+" ";
			}
		}
		System.out.println(result.substring(0, result.length()-1));
		scanner.close();
	}
}
