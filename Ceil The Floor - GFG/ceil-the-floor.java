//{ Driver Code Starts
//Initial Template for Java



import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            Pair ans = new Solve().getFloorAndCeil(arr, n, x);
            System.out.println(ans.floor + " " + ans.ceil);
        }
    }
}

class Pair {
    int floor, ceil;

    Pair() {
        this.floor = 0;
        this.ceil = 0;
    }

    Pair(int floor, int ceil) {
        this.floor = floor;
        this.ceil = ceil;
    }
}

// } Driver Code Ends


//User function Template for Java




class Solve {
    Pair getFloorAndCeil(int[] arr, int n, int x) {
        // code here
        Arrays.sort(arr);
        int floor = Floor(arr , n , x);
        int ciel = Ciel(arr , n , x);
        return new Pair(floor , ciel);
    }
    public static int Floor(int a[] , int n , int x){
        int si = 0;
        int ans = -1;
        int ei = a.length-1;
        while(si <= ei){
            int mid = (ei-si)/2 + si;
            if(a[mid] == x){
                return a[mid];
            }
            if(a[mid]  > x){
                ei = mid-1;
            }else{
                si = mid+1;
                ans = a[mid];
            }
        }
        return ans;
    }
    public static int Ciel(int a[] , int n , int x){
        int si = 0;
        int ans = -1;
        int ei = a.length-1;
        while(si <= ei){
            int mid = (ei-si)/2 + si;
            if(a[mid] == x){
                return a[mid];
            }
            if(a[mid] < x){
                si = mid+1;
            }
            else{
                ei = mid-1;
                ans = a[mid];
            }
        }
        return ans;
    }
}

