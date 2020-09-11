public class Selection_sort{
	void sort(int arr[]){
		int j,mx;
		int temp;
		for(int i=0; i<arr.length; i++){
			mx=0;
			for(j=0; j<arr.length-i; j++){
				if(arr[mx]<arr[j])
					mx=j;
			}
			
			temp=arr[j-1];
			arr[j-1]=arr[mx];
			arr[mx]=temp;
		}
	}
	
	public static void main(String[] args){
		int arr[]={10,9,5,2,7,8,1,3,4,6};
		Selection_sort select=new Selection_sort();

		select.sort(arr);
		for(int d:arr)
			System.out.printf("%d ",d);
	}
	
}
		
		
