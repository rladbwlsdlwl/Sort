public class Merge_sort{
	int[] arr;
	int[] temp;
	public Merge_sort(int[] arr){
		this.arr=arr;
	}	
	void sort(int start,int end){
		if(start<end){
			int mid=(start+end)/2;

			sort(start,mid);
			sort(mid+1,end);
			merge(start,mid,end);
		}
	}

	void merge(int start,int mid,int end){
		temp=new int[end-start+1];
		int startIdx=start,endIdx=mid+1,tempIdx=0;

		while(startIdx<=mid && endIdx<=end)
			temp[tempIdx++]=(arr[startIdx]>arr[endIdx] ? arr[endIdx++] : arr[startIdx++]);

		while(startIdx<=mid)
			temp[tempIdx++]=arr[startIdx++];

		while(endIdx<=end)
			temp[tempIdx++]=arr[endIdx++];

		for(int i=0; i<end-start+1; i++)
			arr[start+i]=temp[i];
	}

	public static void main(String[] args){
		int arr[]={10,9,5,2,7,8,1,3,4,6};

		Merge_sort m=new Merge_sort(arr);
		m.sort(0,arr.length-1);

		for(int data:arr)
			System.out.printf("%d ",data);
		System.out.println();

	}
}

