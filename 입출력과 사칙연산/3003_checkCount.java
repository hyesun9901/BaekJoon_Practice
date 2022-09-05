import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		int D = scanner.nextInt();
		int E = scanner.nextInt();
		int F = scanner.nextInt();

		int RA=1;
		int RB=1;
		int RC=2;
		int RD=2;
		int RE=2;
		int RF=8;
		
		System.out.print((RA-A) + " "+(RB-B)+ " "+(RC-C)+ " "+(RD-D)+ " "+(RE-E)+ " "+(RF-F));
		scanner.close();
	}
}
