public class Bubble_sort{
	void sort(int arr[]){
		int temp;
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr.length-i-1; j++){
				if(arr[j]>arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}

	}
	public static void main(String[] args){
		int arr[]={10,9,5,2,7,8,1,3,4,6};
		Bubble_sort bubble=new Bubble_sort();

		bubble.sort(arr);

		for(int b:arr)
			System.out.printf("%d ",b);
	}
}
