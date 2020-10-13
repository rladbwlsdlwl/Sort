#minheap && descending sort
def buildHeap(arr):
    n=len(arr)-1 #approch index (0~len(arr)-1)
    for i in range(n//2,-1,-1):
        heapify(arr,i,n)
        

def heapify(unsorted,key,size):
    smaller=key
    left=2*key+1; right=2*key+2

    if(left<=size and unsorted[left]<unsorted[smaller]):
        smaller=left
    if(right<=size and unsorted[right]<unsorted[smaller]):
        smaller=right

    if(smaller!=key):
        unsorted[smaller],unsorted[key]=unsorted[key],unsorted[smaller]
        heapify(unsorted,smaller,size)
        
def heapSort(arr):
    buildHeap(arr)
    
    for i in range(len(arr)-1,0,-1):
        arr[0],arr[i]=arr[i],arr[0] #temp arr[0] arr[-1]
        heapify(arr,0,i-1)


arr=list(int(input()) for i in range(int(input())))
heapSort(arr)
print(*arr[::-1],sep='\n')

