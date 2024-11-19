public class Solution {
    void rotateArr(int arr[], int d) {
        // add your code here
        int n = arr.length;
//        for(int i=0;i<d;i++)
//        {
//            int temp=arr[0];
//            for(int j=1;j<n;j++)
//            {
//                arr[j-1]=arr[j];
//                if(j==n-1)
//                    arr[j]=temp;
//            }
//        }

        d=d%n;
        if (d <= n) {
            for (int i = 0, j = d - 1; i < d / 2; i++) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            }

            for (int i = d, j = n - 1; i < j; i++) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            }
            for (int i = 0, j = n - 1; i < n / 2; i++) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

//
