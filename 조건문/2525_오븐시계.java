import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int H = scanner.nextInt();
		int M = scanner.nextInt();
		int cnt = scanner.nextInt();
		
		if(0 == cnt) { 
			System.out.println(H+" "+M);
		}
		else {
			int H_plus = 0;
			M = M + cnt;
			H_plus = (M/60);
			M = M%60;
			
			H = H + H_plus;
			H = H%24;
			
			System.out.println(H+" "+M);
		}
		scanner.close();
	}
}
