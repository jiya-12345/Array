import java.util.Scanner;

public class diagonalsum {
    public static int diagonalsumprint(int arr[][],int m,int n)
    {
        int sum=0;
        int y=n-1;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i][i];
            if(i!=y)
            {
                sum+=arr[i][y];
                
            }
            y--;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int sum=diagonalsumprint(arr,m,n);
        System.out.println("Sum is:"+sum);
        sc.close();
    }

}
