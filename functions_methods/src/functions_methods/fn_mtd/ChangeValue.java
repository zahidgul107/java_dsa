package functions_methods.fn_mtd;

import java.util.Arrays;

public class ChangeValue {

	public static void main(String[] args) {
		
		int[] arr = {2, 5, 34, 23, 324};
		change(arr);
		System.err.println(Arrays.toString(arr));
		

	}
	
	static void change(int[] nums) {
		nums[0] = 99; // If you make the changes to the object via this ref variable, same object will be changed. 
	}

}
