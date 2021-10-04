def linearSearch(arr, x):
    for i in range(len(arr)):
        if arr[i] == x:
            return i
    return -1


if __name__ == "__main__":
    arr = list(map(int, input("enter elements: ").split()))
    x = int(input("enter what to find: "))
    index = linearSearch(arr, x)
    if index == -1:
        print("not found")
    else:
        print("found at index {}".format(index))

    
