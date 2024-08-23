import java.util.Scanner;

public class waveprint {
    public static void waveprinting(int arr[][],int m,int n)
    {
        for(int j=0;j<n;j++)
        {
            if(j%2==0)
            {
                for(int i=0;i<m;i++)
                {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
            else
            {
                for(int i=m-1;i>=0;i--)
                {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
        

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
        waveprinting(arr,m,n);
        sc.close();

    }

}
