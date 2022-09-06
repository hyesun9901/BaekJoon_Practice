import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		ArrayList<Integer> array = new ArrayList<Integer>();
		if(A==B && B==C) {
			System.out.println(10000+A*1000);
		}
		else if(A == B || A == C) {
			System.out.println(1000+A*100);
		}
		else if(B == C){
			System.out.println(1000+(B*100));
		}
		else {
			array.add(A);
			array.add(B);
			array.add(C);
			Collections.sort(array);
			
			System.out.println(array.get(2) * 100);
		}
		scanner.close();
	}
}
