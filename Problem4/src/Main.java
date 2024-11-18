import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

    int t = Integer.parseInt(in.readLine().trim());
        while(t-- > 0) {
            String line = in.readLine();
            String[] tokens = line.split(" ");
            ArrayList<Integer> array = new ArrayList<>();

        for(String token : tokens){
            array.add(Integer.parseInt(token));
        }
        int d = Integer.parseInt(in.readLine().trim());
        int n = array.size();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = array.get(i);

        new Solution().rotateArr(arr,d);
        StringBuffer sb = new StringBuffer();

        for(int value : arr) sb.append(value).append(" ");
        out.println(sb.toString().trim());
        }
        out.flush();
        out.close();
    }
}