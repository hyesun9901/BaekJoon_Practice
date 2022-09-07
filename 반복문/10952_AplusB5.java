import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws Exception, IOException {
		Scanner scanner = new Scanner(System.in);
		int A = 0;
		int B = 0;
		String result="";
		for(;;) {
			A = scanner.nextInt();
			B = scanner.nextInt();
			if(A==0&&B==0) break;
			result+=A+B+"\n";
		}
		
		System.out.println(result);
		scanner.close();
	}
}
