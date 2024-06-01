import java.util.Arrays;

class ArraySort {
    public static void main(String[] args) {
        int x[] = {1, 5, 3, 5, 8, 4, 32, 7, 54, 0};
        Arrays.sort(x);
        for (int num : x) {
            System.out.print(num + " ");
        }
    }
}
