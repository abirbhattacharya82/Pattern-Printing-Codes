//Implementation of selection sort
#include <bits/stdc++.h>
using namespace std;

void swap(int *x, int *y)
{
	int temp = *x;
	*x = *y;
	*y = temp;
}

void selectionSort(int arr[], int n)
{
	int i, j, min_idx;

	for (i = 0; i < n-1; i++)
	{
		min_idx = i;
		for (j = i+1; j < n; j++)
		if (arr[j] < arr[min_idx])
			min_idx = j;
		swap(&arr[min_idx], &arr[i]);
	}
}

int main()
{
    int i,n;
	cout<<"Enter number of elements";
    cin>>n;
    int arr[n];
    cout<<"Enter array elements";
    for (i=0; i < n; i++)
		cin>>arr[i];
	selectionSort(arr, n);
	cout << "Sorted array: \n";
	for (i=0; i <n; i++)
		cout << arr[i] << " ";
	return 0;
}

//~pavithra-064
