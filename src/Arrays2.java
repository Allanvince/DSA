import java.util.Arrays;

public class Arrays2 {
    public int[] twoSum(int[] num, int target){
        for (int i = 0; i< num.length-1; i++){
            if (num[i] + num[i+1] == target){
                int[] output = {i,i+1};
                System.out.println(Arrays.toString(output));
            }
        }
        return num;
    }

    public static void main(String []args){
        Arrays2 arr = new Arrays2();
        arr.twoSum(new int[]{2,7,11,15}, 9);
    }
}
