def binarySearch(arr, x, start, end):
    mid = (start + end)//2
    if end >= start:
        if arr[mid] == x:
            return mid
        elif arr[mid] > x:
            return binarySearch(arr, x, start, mid-1)
        else:
            return binarySearch(arr, x, mid+1, end)
    else:
        return -1


if __name__ == "__main__":
    arr = list(map(int, input("enter elements: ").split()))
    x = int(input("enter what to find: "))
    index = binarySearch(arr, x, 0, len(arr)-1)
    if index == -1:
        print("not found")
    else:
        print("found at index {}".format(index))
