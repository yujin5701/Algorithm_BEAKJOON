import java.io.*;
import java.util.*;

public class Main {
    public static void mergeSort(String[] arr, int left, int right) {
        if (left < right) {
            int mid = (right + left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void merge(String[] arr, int left, int mid, int right) {
        String[] temp = new String[right - left + 1];
        int i = left, j = mid + 1, k = 0;

        while (i <= mid && j <= right) {
            if (arr[i].length() > arr[j].length()) {
                temp[k++] = arr[j++];
            } else if (arr[i].length() < arr[j].length()) {
                temp[k++] = arr[i++];
            } else {
                if(arr[i].compareTo(arr[j]) <= 0){
                    temp[k++] = arr[i++];
                }
                else temp[k++] = arr[j++];
            }
        }
        while (i <= mid)
            temp[k++] = arr[i++];
        while (j <= right)
            temp[k++] = arr[j++];
        for (int a = 0; a < temp.length; a++) {
            arr[left + a] = temp[a];
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }
        String[] arr = set.toArray(new String[0]);
        mergeSort(arr, 0, arr.length - 1);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]).append("\n");
        }
        System.out.println(sb);
    }
}