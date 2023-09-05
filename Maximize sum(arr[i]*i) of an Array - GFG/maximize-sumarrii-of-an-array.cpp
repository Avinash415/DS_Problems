//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution{
    public:
    const int MOD = 1000000007;
    int Maximize(int a[],int n)
    {
        // Complete the function
        sort(a, a+n);
        long long int result=0;
        // long long int val=pow(10,9)+7;
        for(int i=0; i<n; i++)
        {
            result = (result + (static_cast<long long>(a[i]) * i) % MOD) % MOD;
        }
        return result;
    }
};

//{ Driver Code Starts.
int main(){

    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        int a[n];
        for(int i=0;i<n;i++)
            cin>>a[i];
        Solution ob;
        cout<<ob.Maximize(a,n)<<endl;
    }
}
// } Driver Code Ends