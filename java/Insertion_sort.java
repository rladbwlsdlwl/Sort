public class Insertion_sort{
	void sort(int arr[]){
		int key;
		int j;
		for(int i=1; i<arr.length; i++){
			key=arr[i];
			for(j=i-1; j>=0; j--){
				if(arr[j]>key)
					arr[j+1]=arr[j];
				else
					break;
			}
			arr[j+1]=key;
		}
	}

	public static void main(String[] args){
		int arr[]={10,9,5,2,7,8,1,3,4,6};

		Insertion_sort insertion=new Insertion_sort();
		insertion.sort(arr);

		for(int i:arr)
			System.out.printf("%d ",i);

	}
}
