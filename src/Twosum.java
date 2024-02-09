
/**
 * int reversed = 0
 * int original = x
 * while (x > 0){
 *     int rem = x % 10
 *     x = x / 10
 *     reversed = reversed * 10 + rem
 * }
 * return rev == original*/
public class Twosum {

    public int unique(int[]arr){

        if (arr.length == 0){
            return 0;
        }

        int unique = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[unique] = arr[i];
                unique++;
            }
        }
        return unique;
    }

    public static void main(String[]args){
        Twosum two = new Twosum();
        int[] arrayOfNums = new int[]{0,0,1,1,1,2,2,3,3,4};
        int numberOfUniqueElements = two.unique(arrayOfNums);
        System.out.println("Number of unique elements:" + numberOfUniqueElements);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < numberOfUniqueElements; i++) {
            System.out.print(arrayOfNums[i] + " ");
        }
        System.out.println();
    }

}
