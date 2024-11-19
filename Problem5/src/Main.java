import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc-- > 0){
            String[] inputLine = br.readLine().split(" ");
            int[] arr = new int[inputLine.length];
            for(int i=0;i<inputLine.length;i++)
            {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            int N = arr.length;
            Solution ob = new Solution();
            ob.nextPermutation(arr);
            StringBuilder out = new StringBuilder();
            for(int i=0;i<N;i++){
                out.append(arr[i]+" ");
            }
            System.out.println(out.toString().trim());
        }
    }
}