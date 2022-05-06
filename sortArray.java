package ArraysDS;

public class sortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {6,2,1,4,3,10,9,7,8};
		//int a[]=new int[arr.length];
		int temp=0;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]) {
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;

				}
			}

			System.out.print(arr[i]+" "); 
			
		}

	}

}

