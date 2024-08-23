import java.util.*;

public class multiplication {
    public static int[][] multiplicationofarray(int arr1[][],int arr2[][],int m,int n,int p)
    {
        int result[][]=new int[m][p];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<p;j++)
            {
                for(int k=0;k<n;k++)
                {
                    result[i][j]+=arr1[i][k]*arr2[k][j];
                }
            }
        }
        return result;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int p = sc.nextInt();
        int arr1[][] = new int[m][n];
        int arr2[][] = new int[n][p];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        if (arr1[0].length == arr2.length) {
            int ans[][] = multiplicationofarray(arr1, arr2, m, n, p);
            for(int i=0;i<ans.length;i++)
            {
                for(int j=0;j<ans[0].length;j++)
                {
                    System.out.print(ans[i][j]+" ");
                }
                System.out.println();
            }

        } 
        else {
            System.out.println("Multiplication is not possible");
        }
        sc.close();
    }

}
