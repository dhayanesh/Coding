def invCounter(arr, left, right):
    invCount = 0
    mid = 0
    if(left < right):
        mid = int(left + (right - left)/2)

        #recursive-calls to add up inversions from merge sort implementation
        invCount = invCount + invCounter(arr, left, mid)
        invCount = invCount + invCounter(arr, mid+1, right)
        invCount = invCount + invAdder(arr, left, mid, right)
    return invCount

def invAdder(arr, left, mid, right):
    invCount = 0
    x = mid - left + 1
    y = right - mid
    leftArr = []
    rightArr = []

    #copy array elements into sub-arrays
    for i in range (0, x):
        leftArr.append(arr[i+left])
    for j in range (0, y):
        rightArr.append(arr[j+mid+1])

    leftInc = 0
    rightInc = 0
    curPtr = left
    #store the minimum elements in array
    while (leftInc < x and rightInc < y):
        if(leftArr[leftInc] <= rightArr[rightInc]):
            arr[curPtr] = leftArr[leftInc]
            leftInc+=1
            curPtr+=1
        else:
            arr[curPtr] = rightArr[rightInc]
            rightInc+=1
            curPtr+=1
            invCount = invCount - leftInc + x 
    #storing remaining elements        
    while(leftInc < x):
        arr[curPtr] = leftArr[leftInc]
        leftInc+=1
        curPtr+=1
    while(rightInc < y):
        arr[curPtr] = rightArr[rightInc]
        rightInc+=1
        curPtr+=1
    return invCount

#get array inputs for inversion
arr = []
count = int(input())
for i in range(0, count):
    inp = int(input())
    arr.append(inp)

invCount = invCounter(arr, 0 ,count-1)

print(invCount)
