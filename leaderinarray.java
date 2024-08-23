import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LeaderInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        
        if (n > 0) {
            int maxFromRight = arr[n - 1];
            result.add(maxFromRight);
            
            for (int i = n - 2; i >= 0; i--) {
                if (arr[i] > maxFromRight) {
                    maxFromRight = arr[i];
                    result.add(maxFromRight);
                }
            }
            
            Collections.reverse(result); // Correctly reverse the result list
            
            // Print the result
            for (int
