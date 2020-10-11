public class Quick_sort{
	
	int[] arr;
	public Quick_sort(int[] arr){
		this.arr=arr;
	}
	
	void sort(int begin,int end){
		if(begin<end){
			int mid=partition(begin,end);
			sort(begin,mid-1);
			sort(mid+1,end);
		}
	}

	int partition(int begin,int end){
		int i=begin,j=begin;
		int key=arr[end]; // pivot

		for(; i<end; i++){
			if(arr[i]<key){
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j++]=temp;
			}
		}
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;

		return j;
	}

	public static void main(String[] args){
		int[] arr={10,9,5,2,7,8,1,3,4,6};

		Quick_sort q=new Quick_sort(arr);
		q.sort(0,arr.length-1);

		for(int data:arr)
			System.out.printf("%d ",data);
		System.out.println();

	}
}

