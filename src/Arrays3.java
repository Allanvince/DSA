import java.util.PriorityQueue;

public class Arrays3 {

    public static int largest(int []num, int k){

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int nums : num){
            minHeap.add(nums);
            if (minHeap.size() > k){
                minHeap.poll(); // Remove smallest element when size exceeds k
            }
        }
        return minHeap.peek();
    }
    public static int search(int[]nums, int target){
        int left = 0;
        int right = nums.length-1;

        while (left <= right){
            int mid = left + (right - left) / 2;

            if (nums[mid] == target){
                return mid;
            }
            if (nums[left] <= nums[mid]){
                if (target >= nums[left] && target < nums[mid]){
                    right =mid -1;
                }
                else{
                    left = mid +1;
                }
            }
            else{
                if (target > nums[mid] && target <= nums[right]){
                    left = mid +1;
                }else{
                    right = mid -1;
                }
            }
        }
        return -1;
    }
    public static void main(String[]args){
        int [] nums = {9,8,10,11,15,14};
        int target = 11;
        int k = 2;
        System.out.println("Second largest element: " + largest(nums,k));
//        System.out.println("Index of " + target + " is: " + search(nums, target));
    }
}
