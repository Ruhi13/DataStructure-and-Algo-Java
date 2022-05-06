package ArraysDS;

public class maxSubarray {

	public static void main(String[] args) {
		int[] nums= {-2, -3, 4, -1, -2, 1, 5, -3};
		System.out.println(maxSum(nums));
		

	}

	private static int maxSum(int[] nums) {
		int maxVal=Integer.MIN_VALUE;
		int sum=0;
		for(int i=0;i<nums.length;i++) {
			sum+=nums[i];
			if(maxVal<sum)
				maxVal=sum;
			if(sum<0)
				sum=0;
		}
		return maxVal;
		
		
		
	}

}
