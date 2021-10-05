def insertionSort(arr, inplace = False):
	if not inplace:
		arr = arr.copy()

	for i in range(1, len(arr)):
		key = arr[i]
		j = i-1
		while j >= 0 and key < arr[j]:
			arr[j + 1] = arr[j]
			j -= 1
		arr[j + 1] = key

	if not inplace:
		return arr

arr = [12, 11, 13, 5, 6]
sorted_arr = insertionSort(arr, inplace = False)
print(sorted_arr)