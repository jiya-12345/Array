import java.util.*;
public class largetintotwodarray
{
    public static int largestinarr(int arr[][])
    {
        int m=arr.length;
        int n=arr[0].length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i][j]>max)
                {
                    max=arr[i][j];
                }
            }
        }
        return max;
    }
    public static int sumofalleleemnt(int arr[][],int n,int m)
    {
        int sum=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                sum+=arr[i][j];
            }
            
        }
        return sum;
    }
    public static int[][] additionofmatrix(int arr[][],int arr2[][])
    {
        int n=arr.length;
        int m=arr[0].length;
        int [][]ans=new int[m][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                ans[i][j]=arr[i][j]+arr2[i][j];
            }
        }
        return ans;
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int [m][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int arr2[][]=new int[m][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr2[i][j]=sc.nextInt();
            }
        }
        // int large=largestinarr(arr);
        // System.out.println("Largest element is:"+large);
        // int sum=sumofalleleemnt(arr,n,m);
        // System.out.println("Sum is:"+sum);
        int add[][]=additionofmatrix(arr,arr2);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(add[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();

    }
}
