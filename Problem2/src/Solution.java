public class Solution {
    void pushZerosToEnd(int[] arr)
    {
        int n=arr.length;

        for(int i=0,j=i+1;j<n;j++)
        {
            if(arr[i]==0&&arr[j]!=0)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
            else if(arr[i]==0&&arr[j]==0)
            {
                continue;
            }
            else{
                i++;
            }
        }
    }
}
