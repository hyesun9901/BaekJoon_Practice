import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws Exception, IOException {
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int N = Integer.parseInt(br.readLine());
			StringBuilder sb = new StringBuilder();
	 
			for (int i = 0; i < N; i++) {		
				String str = br.readLine();
				int target = str.indexOf(" ");
				int result = Integer.parseInt(str.substring(0,target)) + Integer.parseInt(str.substring(target + 1));		
				sb.append("Case #"+(i+1)+": "+Integer.parseInt(str.substring(0,target))+" + "+Integer.parseInt(str.substring(target + 1))+" = "+result+"\n");
			}
			
			br.close();
			System.out.print(sb);
	}
}
