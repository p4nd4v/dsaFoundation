/*
Return array sum
Question - Given an array/list(ARR) of length N, you need to find and return the sum of all the elements in the array/list
*/

public class ReturnArraySum {
	
	public static int sum(int[] arr) {
		int n = arr.length;
        int sum = 0;
        
        int i = 0, j = n-1;
        while(i <= j) {
            sum += arr[i];
            i++;
        }
        
        return sum;
	}
}