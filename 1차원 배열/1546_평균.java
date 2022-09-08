import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception, IOException {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        ArrayList<Integer> array = new ArrayList<Integer>(n);
        for (int i = 0; i < n; i++) 
            array.add(scanner.nextInt());
        Collections.sort(array,Collections.reverseOrder());//80 60 40
        
        ArrayList<Float> resultArray = new ArrayList<Float>(n);
        resultArray.add((float)100);//80
        for(int i=1;i<n;i++)
            resultArray.add(array.get(i)/(float)array.get(0)*100);
        
        float sum=0;
        for(int i=0;i<n;i++)
            sum+=resultArray.get(i);
        System.out.print(sum/n);
        scanner.close();
    }
}
