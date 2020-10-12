//Minheap 내림차순정렬
public class Heap_sort{
	
	int[] arr;
	public Heap_sort(int[] arr){
		this.arr=arr;
	}
		
	void buildHeap(int n){
		for(int i=n/2;i>0;i--)
			heapify(i,n);
	}

	void heapify(int k,int n){
		int left=2*k,right=2*k+1;
		int smaller;

		if(right<=n) // exist both childNode based on k parentNode 
			smaller=(arr[left]>arr[right] ? right : left);
		else if(left<=n) // exist left childNode
			smaller=left;
		else
			return ;

		if(arr[smaller]<arr[k]){
			int temp=arr[smaller];
			arr[smaller]=arr[k];
			arr[k]=temp;

			heapify(smaller,n);
		}
	}

	void sort(int n){
		buildHeap(n);

		for(int i=n;i>=2; i--){
			int temp=arr[1];
			arr[1]=arr[i];
			arr[i]=temp;

			heapify(1,i-1);
		}
	}

	public static void main(String[] args){
		int[] unsorted={0,1,7,8,3,9,4,2,6};

		Heap_sort h=new Heap_sort(unsorted);
		h.sort(unsorted.length-1);

		for(int i=unsorted.length-1; i>=1; i--)
			System.out.printf("%d ",unsorted[i]);
		System.out.println();

	}
}
