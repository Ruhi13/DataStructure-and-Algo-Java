package ArraysDS;

import java.util.Arrays;

public class largestElement {

	public static void main(String[] args) {
		int arr[]= {2,31,4,6,9,10};
		int n=arr.length;
		Arrays.sort(arr);
		int largest=arr[0];
		int secondLargest=arr[1];
		for(int i=0;i<n;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
				
			}
			
		}
		for(int i=0;i<n-1;i++) {
			if(arr[i]>secondLargest) {
				secondLargest=arr[i];
				
			}
		}
		System.out.println(largest);
		System.out.println(secondLargest);
		


	}

}
