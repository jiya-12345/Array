class Solution {
    int getMinDiff(int[] arr, int n, int k) {
    
        // code here
        Arrays.sort(arr);
        int maxelement=arr[n-1];
        int minelement=arr[0];
        int result=maxelement-minelement;
        for(int i=1;i<n;i++)
        {
            int min=Math.min(arr[0]+k,arr[i]-k);
            int max=Math.max(arr[i-1]+k,arr[n-1]-k);
            result=Math.min(result,max-min);
        }
        return result;
    }
}
