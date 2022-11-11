//{ Driver Code Starts
import java.util.Scanner;

class SquartRoot
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			long a = sc.nextInt();
			Solution obj = new Solution();
			System.out.println(obj.floorSqrt(a));
		t--;
		}
	}
}
// } Driver Code Ends


/*You are required to complete
this function*/

// Function to find square root
// x: element to find square root
class Solution
{
     long floorSqrt(long x)
	 {
		// Your code here
	    long ans = 0;
		long s = 0;
		long e = Integer.MAX_VALUE;
		while(s <= e){
		    long mid = (e-s)/2 + s;
		    long n = mid*mid;
		    if(x == n){
		        return mid;
		    }
		    else if(x > n){
		        ans = mid;
		        s = mid+1;
		    }
		    else{
		        
		        e = mid-1;
		    }
		}
		return ans;
		
	 }
	 
}
