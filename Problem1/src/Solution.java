class Solution {
    public int getSecondLargest(int[] arr){
        int large = arr[0];
        int secLarge = -1;
        for(int i=1;i<arr.length;i++)
        {
           if(arr[i]>large)
           {
               secLarge = large;
               large = arr[i];
           }
           else if(arr[i]>secLarge&&arr[i]!=large)
           {
               secLarge = arr[i];
           }
        }
        return secLarge;
    }
}
