 
// Given a set of non-negative integers, and a value sum, determine if there is a subset of the given set with sum equal to given sum. 

// Example: 

// Input: set[] = {3, 34, 4, 12, 5, 2}, sum = 9
// Output: True  
// There is a subset (4, 5) with sum 9.

// Input: set[] = {3, 34, 4, 12, 5, 2}, sum = 30
// Output: False
// There is no subset that add up to 30.

#include <bits/stdc++.h>
using namespace std;
 
// Returns true if there is a subset
// of set[] with sum equal to given sum
bool isSubsetSum(int set[], int n, int sum)
{
   
    // Base Cases
    if (sum == 0)
        return true;
    if (n == 0)
        return false;
 
    // If last element is greater than sum,
    // then ignore it
    if (set[n - 1] > sum)
        return isSubsetSum(set, n - 1, sum);
 
    /* else, check if sum can be obtained by any
of the following:
      (a) including the last element
      (b) excluding the last element   */
    return isSubsetSum(set, n - 1, sum)
           || isSubsetSum(set, n - 1, sum - set[n - 1]);
}
 
// Driver code
int main()
{
    int n,sum;
    cin>>n;
    int set[n];
    for(int i=0;i<n;i++)
    cin>>set[i];

    cin>>sum;
    if (isSubsetSum(set, n, sum) == true)
         cout <<"Found a subset with given sum"<<endl;
    else
        cout <<"No subset with given sum"<<endl;
    return 0;
}