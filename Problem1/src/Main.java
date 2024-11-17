import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0)
        {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            Solution obj = new Solution();
            int ans = obj.getSecondLargest(arr);
            System.out.println(ans);
        }
    }
}