import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		
		int B100 = B/100; 
		int B10 = (B- B100*100)/10;
		int B1 = B - B100*100 - B10*10;
		
		System.out.println(A*B1);
		System.out.println(A*B10);
		System.out.println(A*B100);
		System.out.println(A*B);
		scanner.close();
	}
}
