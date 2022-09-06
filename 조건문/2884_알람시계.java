import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int totalMinute = 0;
		int resultHour = 0;
		int resultMinute = 0;
		
		//0시 0분
		//0시 44분
		//A시 44분
		if(A==0 && B<45) {//0시 44분
			totalMinute = 24*60 + B - 45;
			resultHour = totalMinute/60;
			resultMinute = totalMinute%60;
		}
		else{
			totalMinute = A*60 + B - 45;
			resultHour = totalMinute/60;
			resultMinute = totalMinute%60;
		}	
		
		System.out.print(resultHour +" "+resultMinute );
		scanner.close();
	}
}
