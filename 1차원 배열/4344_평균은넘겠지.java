import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception, IOException {
        Scanner scanner = new Scanner(System.in);
        int nCase = scanner.nextInt();
        int[] tmpArray;
        int nStudent=0;
        for (int i = 0; i < nCase; i++) {
            nStudent = scanner.nextInt();//5명
            tmpArray = new int[nStudent];
            int sum=0;
            for (int j = 0; j < nStudent; j++) {
                tmpArray[j] = scanner.nextInt();
                sum+=tmpArray[j];
            }
            float aver=(float) sum/(float)nStudent;
            int count=0;
            for(int k=0;k<nStudent;k++){
                if(aver<tmpArray[k])
                    count++;
            }
            float test=(float) count/(float)nStudent*100;
            System.out.printf("%.3f%%\n",test);
        }

        scanner.close();
    }
}
