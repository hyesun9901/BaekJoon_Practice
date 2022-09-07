import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws Exception, IOException {
		Scanner scanner = new Scanner(System.in);
		int A = 0;
		A = scanner.nextInt();
		int copyA=A;
		int cnt=0;
		int tmp1=0;
		int tmp2=0;
		// A=26
		while(true) {
			tmp1=A/10;//6
			tmp2=A%10;//8
			A = tmp1+tmp2;//6+8=14
			A = tmp2*10+ A%10;//84
			cnt++;
			if(copyA==A) break;
		}
		System.out.println(cnt);
		scanner.close();
	}
}
