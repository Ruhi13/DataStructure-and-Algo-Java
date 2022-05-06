package ArraysDS;

import java.util.Arrays;

public class smallestElement {

	public static void main(String[] args) {
		int arr[]= {2,1,4,6,9,10,0};
		int n=arr.length;
		Arrays.sort(arr);
		int smallest=arr[0];
//		int secondLargest=arr[1];
		for(int i=0;i<n;i++) {
			if(arr[i]<smallest) {
				smallest=arr[i];
				
			}
			
		}
//		for(int i=0;i<n-1;i++) {
//			if(arr[i]>secondLargest) {
//				secondLargest=arr[i];
//				
//			}
//		}
		System.out.println(smallest);
//		System.out.println(secondLargest);
		


	}

}
