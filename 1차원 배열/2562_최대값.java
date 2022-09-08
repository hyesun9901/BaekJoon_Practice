import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws Exception, IOException {
		Scanner scanner = new Scanner(System.in);
		int tmp=0;
		ArrayList<Integer> array = new ArrayList<>();
		ArrayList<Integer> tmpArray = new ArrayList<>();
		for(int i=0;i<9;i++) {
			tmp=scanner.nextInt();
			array.add(tmp);
			tmpArray.add(tmp);
		}
		Collections.sort(array);
		for(int j=0;j<9;j++) {
			if(tmpArray.get(j)==array.get(8)) {
				System.out.println(array.get(8)+"\n"+(j+1));
				break;
			}
		}
		scanner.close();
	}
}
