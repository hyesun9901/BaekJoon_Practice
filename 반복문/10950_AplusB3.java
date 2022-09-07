import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		ArrayList<Integer> array = new ArrayList<Integer>();
		int B,C=0;
		for(int i= 0;i<A;i++) {
			B=scanner.nextInt();
			C=scanner.nextInt();
			array.add(B+C);
		}
		for(int i= 0;i<A;i++) {
			System.out.println(array.get(i));
		}
		scanner.close();
	}
}
