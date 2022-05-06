package ArraysDS;

import java.util.Arrays;

public class arraySort012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,2,1,2,1,0,1,2,1,2};

		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					int temp=arr[i+1];
					arr[i+1]=arr[j];
					arr[j]=temp;

				}
			}
			System.out.print(arr[i]+" ");
		}

	}

}
