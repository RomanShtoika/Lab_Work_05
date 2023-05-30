public class Exercise_2 {
    public static void main(String[] args) {
        int a = 0;
        int b = 4;
        int c = 1;
        int smallest = Small(a, b, c);
        System.out.println("The smallest number: " + smallest);
    }
    public static int Small(int a, int b, int c) {
        int smallest = a;
        if (b < smallest) {
            smallest = b;
        }
        if (c < smallest) {
            smallest = c;
        }
        return smallest;
    }
}
