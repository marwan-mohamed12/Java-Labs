import java.lang.*;
class BinarySearch{
	public static void main(String args[]) {
		int value = 0;
		if (args.length == 0) {
			System.out.println("You Have To Enter Number");
		} else {
			value = Integer.parseInt(args[0]);
		}
		
		int nums[] = new int [1000];
		for (int i = 0; i < 1000; i++) {
			nums[i] = i;
		}
		
		long start = System.nanoTime();
		
		int low = 0, high = nums.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			
			if (nums[mid] == value) {
				System.out.println("Found At Index: " + mid);
				break;
			} else if (nums[mid] < value) {
				low += 1;
			} else {
				high = mid - 1;
			}
		}
		
		long end = System.nanoTime();
		long time = end - start;
		
		System.out.println("Start Time: " + start);
		System.out.println("End Time: " + end);
		System.out.println("Running Time: " + time );
	}
}