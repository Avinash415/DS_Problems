//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
class Solution{
  public:

    int smallestSubWithSum(int arr[], int n, int x)
    {
        // Your code goes here
         int len = -1, sum = 0, j = 0;
    for(int i=0; i<n;) {
        if(arr[i] > x)
            return 1;
        sum += arr[i];
        if(sum > x) {
            if(len == -1 || len > i - j + 1)
                len = i - j + 1;
            sum -= arr[j++];
            sum -= arr[i];
        }
        else {
            i++;
        }
    }
    return len == -1 ? 0 : len;
    }
};

//{ Driver Code Starts.

int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--)
	{
		int n,x;
		cin>>n>>x;
		int a[n];
		for(int i=0;i<n;i++)
		cin>>a[i];
		Solution obj;
		cout<<obj.smallestSubWithSum(a,n,x)<<endl;
	}
	return 0;
}
// } Driver Code Ends