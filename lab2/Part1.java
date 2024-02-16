import java.lang.*;
public class Part1{
	public static void main(String args[]){
		long start = System.nanoTime();
		int nums[] = new int [1000];
		for (int i = 0; i < 1000; i++) {
			nums[i] = i;
		}
		int minValue = nums[0];
		int maxValue = nums[0];
		for (int i = 1; i < nums.length; i++) {
			
			if (minValue > nums[i]) {
				minValue = nums[i];
			}
			
			if (maxValue < nums[i]) {
				maxValue = nums[i];
			}	
		}
		long end = System.nanoTime();
		
		long time = end - start;

		System.out.println("Min value: " + minValue);
		System.out.println("Max value: " + maxValue);
		//System.out.println("Start Time: " + start);
		//System.out.println("End Time: " + end);
		System.out.println("Running Time: " + time );
	}
}