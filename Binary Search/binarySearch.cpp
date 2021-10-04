#include <iostream>
using namespace std;


int binary(int arr[], int l, int r, int x){
	if (r >= l) {
		int mid = l + (r - l) / 2;

		if (arr[mid] == x)
			return mid;

		if (arr[mid] > x)
			return binary(arr, l, mid - 1, x);

		return binary(arr, mid + 1, r, x);
	}

	return -1;
}

int main(void){
	int arr[] = { 1,6,3,9,5,34,67,13 };
	int x;
    cout<<"Enter the element to search:";
    cin>>x;
	int n = sizeof(arr) / sizeof(arr[0]);
	int result = binary(arr, 0, n - 1, x);
	(result == -1) ? cout << "Element is not present.": cout << "Element is present at index:" << result;
	return 0;
}
