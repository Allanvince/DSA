import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Arrays2 {

    //has a time complexity of O(n^2) as a result of the two nested for loops
    public void twoSum(int[] num, int target){
        for (int i=0; i < num.length-1; i++){
            for (int j= i+1; j < num.length; j++){
                if (num[i] + num[j] == target){
                    int [] output = {i, j};
                    System.out.println(Arrays.toString(output));
                }
            }
        }
    }
    //has a time complexity of O(n) since we only iterate through the array once
    //HashMap allows us to look up the elements in constant time
    public void twoSum2(int[] num2, int goal){
        Map<Integer, Integer> map = new HashMap<>();

        for (int m=0; m < num2.length; m++){
            int complement = goal - num2[m];

            if (map.containsKey(complement)){
                int[] output2 = {map.get(complement), m};
                System.out.println(Arrays.toString(output2));
            }
            map.put(num2[m], m);
        }
    }

    public boolean palindrome(int x){

        String ofX = String.valueOf(x);

        String ofXReversed = new StringBuilder(ofX).reverse().toString();


        return ofX.equals(ofXReversed);
    }


    public static void main(String []args){
        Arrays2 arr = new Arrays2();
//        arr.twoSum(new int[]{2,3,4}, 6);
//        arr.twoSum2(new int[]{2,7,11,15},9);

        int input = -121;
        arr.palindrome(input);

    }
}
