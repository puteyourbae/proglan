//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;

public class MergeSortSimple {
    public static void mergeSort(int[] arr) {
        if (arr.length <= 1) return;

        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        mergeSort(left);9
        mergeSort(right);

        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length)
            arr[k++] = (left[i] < right[j]) ? left[i++] : right[j++];
        while (i < left.length) arr[k++] = left[i++];
        while (j < right.length) arr[k++] = right[j++];
    }

    public static void main(String[] args) {
        int[] data = {98, 23, 45, 14, 6, 67, 33, 42};

        System.out.println("Sebelum diurutkan: " + Arrays.toString(data));
        mergeSort(data);
        System.out.println("Setelah diurutkan: " + Arrays.toString(data));
    }
}


