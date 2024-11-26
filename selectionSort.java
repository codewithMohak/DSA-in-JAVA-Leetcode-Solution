public class selectionSort {
    public static void main(String[] args) {
        int[] arr = { 2, 8, 4, -1, 7, 10, 5, 6 };
        selectionSort(arr);
    }

    public static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int minVal = arr[i];
            int minIdx = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < minVal) {
                    minVal = arr[j];
                    minIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
        for (int val : arr) {
            System.out.println(val);
        }
    }
}
