import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception, IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<String> array = new ArrayList<String>(n);
        for (int i = 0; i < n; i++)
            array.add(scanner.next());

        ArrayList<Integer> resultArray = new ArrayList<Integer>(n);
        for (int i = 0; i < n; i++) {
            int point = 0;
            int sum = 0;
            String tmp = array.get(i);
            for (int j = 0; j < tmp.length(); j++) {//OXOOOO
                if ('O' == tmp.charAt(j)) {
                    point++;
                } else
                    point = 0;
                sum += point;
            }
            resultArray.add(sum);
        }
        for(int i=0;i<n;i++){
            System.out.println(resultArray.get(i));
        }
        scanner.close();
    }
}
