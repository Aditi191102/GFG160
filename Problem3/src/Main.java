import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        while (tc-->0)
        {
            String str[] = br.readLine().split(" ");
            int arr[] = new int[str.length];

            for(int i=0;i<str.length;i++)
                arr[i] = Integer.parseInt(str[i]);

            Solution obj = new Solution();
            obj.reverseArray(arr);

            for(int i=0;i<arr.length;i++)
            {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}