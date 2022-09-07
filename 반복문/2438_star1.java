import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws Exception, IOException {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		String star="";
		for(int i=0;i<N;i++) {
			star+="*";
			System.out.println(star);
		}
		scanner.close();
	}
}
