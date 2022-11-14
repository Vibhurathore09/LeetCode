//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String txt = br.readLine().trim();
            String pat = br.readLine().trim();

            int ans = new Solution().search(pat, txt);

            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    boolean check(int a1[],int a2[])

   {

       for(int i=0;i<26;i++)

       {

           if(a1[i]!=a2[i])

           return false;

       }

       return true;

   }

    int search(String txt, String pat) {

        // code here

        if(pat.length()<txt.length())

        return 0;

        int count=0;

        int win=txt.length();

        int a1[]=new int[26];
        int a2[]=new int[26];

        for(int i=0;i<win;i++)
        {
            a1[txt.charAt(i)-'a']++;
        }
        // for(int i : a1){
        //     System.out.print(i+" ");
        // }
        for(int i=0;i<win;i++)
        {
            a2[pat.charAt(i)-'a']++;
        }
        // System.out.println();
        // for(int i : a2){
        //     System.out.print(i+" ");
        // }
        if(check(a1,a2))

        count++;

        int j=0;

        for(int i=win;i<pat.length();i++)
        {

            a2[pat.charAt(j)-'a']--;

            a2[pat.charAt(i)-'a']++;
            
            if(check(a2,a1))
              count++;
             j++; 
        }
        return count;
    }
}