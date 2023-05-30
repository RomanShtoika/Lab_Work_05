public class Exercise_4 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 5, 4, 11, 8, 25};
        int max = MaxNumber(arr);
        System.out.println("The largest number in the array: " + max);
    }

    public static int MaxNumber(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
