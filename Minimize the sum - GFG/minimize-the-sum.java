//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


// } Driver Code Ends
//User function Template for Java

class Solution {
    long minimizeSum(int n, int arr[]) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i =  0 ; i < n ; i++){
            pq.add(arr[i]);
        }
        int sum = 0;
        int sum2 =0;
        while(pq.size()!=1){
            sum = pq.poll()+pq.poll();
            sum2 += sum;
            pq.add(sum);
        }
        return sum2;
    }
}

//{ Driver Code Starts.

public class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt();
            int A[] = new int[n];
            
            for (int i = 0; i < n;i++)
            {
                A[i] = sc.nextInt();
            }
            Solution obj = new Solution();
            long ans = obj.minimizeSum(n, A);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends