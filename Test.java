public class Test {
	public static void main(String[] args) {
		System.out.println(groupSum(0, [1, 2, 3], 6));
		System.out.println(groupSum(0, [1, 2, 3], 7));
		System.out.println(groupSum(0, [1, 2, 3], 4));
	}
	public boolean groupSum(int start, int[] nums, int target) {
	  if(start >= nums.length) {
	    if(target == 0) return true;
	    else return false;
	  } else {
	    if(start + 1 < nums.length) {
	      return groupSum(start + 1, nums, target - nums[start]) || groupSum(start + 1, nums, target - nums[start +1]);
	    } else {
	      return true;
	    }
	  }
	}

}
