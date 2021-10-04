const binarySearch = (arr, valueToFind, startPosition, endPosition) => {
    // guard clause
    if (start > end) {
        return false
    }

    // find the middle index between your start and end positions
    let middle = Math.floor((startPosition + endPosition) / 2)

    // check to see if you happened to find it
    if (arr[middle] === valueToFind) {
        return true
    }

    // check you value vs the valueToFind, and re-adjust search
    if (arr[middle] > x) {
        const newEndPosition = middle - 1
        return binarySearch(arr, valueToFind, startPosition, newEndPosition)
    } else {
        const newStartPosition = middle + 1
        return binarySearch(arr, valueToFind, newStartPosition, endPosition)
    }
}