package ArraysDS;

import java.util.Arrays;
import java.util.Scanner;

public class leftRotation {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		//int output[]=new int[arr.length];
		int n=3;
		leftRotate(arr,n);
		System.out.println(Arrays.toString(arr));


	}

	private static void leftRotate(int[] arr,int n) {
		for(int i=0;i<arr.length;i++) {
			int j,first;
			first=arr[0];
			for(j=0;j<arr.length-1;i++) {
				arr[j]=arr[j+1];
			}
			arr[j]=first;
		}
				
	}

}
