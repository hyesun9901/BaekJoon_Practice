import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int allPrice = scanner.nextInt();
		int cnt= scanner.nextInt();
		int A,B=0;
		int search=0;
		for(int i=0;i<cnt;i++) {
			A=scanner.nextInt();
			B=scanner.nextInt();
			search=search+A*B;
		}
		if(search==allPrice)System.out.println("Yes");
		else System.out.println("No");
		
		scanner.close();
	}
}
