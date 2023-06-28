import java.util.Scanner;

public class Arrays {
    Scanner sc = new Scanner(System.in);
        public void arraySum(){

            System.out.println("Enter the length of the array: ");
            int size = sc.nextInt();

            int [] arr = new int[size];
            System.out.println("Enter elements of the array separated by a space: ");
            for (int i =0; i < arr.length; i++){
                arr[i] = sc.nextInt();
            }
            System.out.println(java.util.Arrays.toString(arr));

            int sum = 0;
            for (int j=0; j < arr.length; j++){
                sum = sum + arr[j];
            }
            System.out.println(sum);

        }
        public void maxValue(){
            System.out.println("Enter the length of the array: ");
            int size = sc.nextInt();

            int [] arr = new int[size];
            for (int i =0; i < arr.length; i++){
                arr[i] = sc.nextInt();
            }
            System.out.println(java.util.Arrays.toString(arr));

            int max = Integer.MIN_VALUE;
            for (int i : arr) {
                if (i > max) {
                    max = i;
                }
            }
            System.out.println(max);
        }
        public void reverseArray(){
            System.out.println("Enter the length of the array: ");
            int size = sc.nextInt();

            int [] arr = new int[size];
            for (int i =0; i < arr.length; i++){
                arr[i] = sc.nextInt();
            }
            System.out.println(java.util.Arrays.toString(arr));

            int i =0;
            int j= size -1;
            while (i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]=temp;

                i++;
                j--;
            }
            System.out.println(java.util.Arrays.toString(arr));
        }
        public void subArray(){
            System.out.println("Enter the length of the array: ");
            int size = sc.nextInt();

            int [] arr = new int[size];
            for (int i =0; i < arr.length; i++){
                arr[i] = sc.nextInt();
            }
            System.out.println(java.util.Arrays.toString(arr));

            for (int si =0; si <size; si++){
                for (int ei =si; ei < size; ei++){

                    for (int k = si; k<=ei; k++){
                        System.out.print(arr[k]+" ");
                    }
                    System.out.println();
                }
            }
        }

    public static void main(String[] args) {
        Arrays obj = new Arrays();
//        obj.arraySum();
        //obj.maxValue();
        //obj.reverseArray();
        obj.subArray();
    }
}
