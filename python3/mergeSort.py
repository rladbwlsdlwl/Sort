import sys
input=sys.stdin.readline

def merge_sort(arr):
    if(len(arr)==1):
        return arr
    m=len(arr)//2
    left=merge_sort(arr[0:m])
    right=merge_sort(arr[m:])
    return merge(left,right)

def merge(left,right):
    sort=[]
    i=0;j=0
    while(i<len(left) and j<len(right)):
        if(left[i]>right[j]):
            sort.append(right[j])
            j+=1
        else:
            sort.append(left[i])
            i+=1

    if(i==len(left)):
        sort=sort+right[j:]
    if(j==len(right)):
        sort=sort+left[i:]

    return sort
        
arr=[int(input()) for i in range(int(input()))]
m=merge_sort(arr)
print(*m,sep="\n")

