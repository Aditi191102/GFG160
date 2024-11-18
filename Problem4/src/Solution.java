public class Solution {
    void rotateArr(int arr[], int d) {
        // add your code here
        int n=arr.length;
        for(int i=0;i<d;i++)
        {
            int temp=arr[0];
            for(int j=1;j<n;j++)
            {
                arr[j-1]=arr[j];
                if(j==n-1)
                    arr[j]=temp;
            }
        }
        for (int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
