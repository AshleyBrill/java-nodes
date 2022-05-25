import java.util.Arrays;
public class final1ex1 {
	public static void main(String[] args) {
		int[] arr = {3, 12, 44, 23, 6, 1, 90};
		sort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static int partition(int[] arr, int left, int right) {
		int pivot = arr[right];
		int i = (left - 1);
		for(int j = left; j < right; j++) {
			if(arr[j] <= pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i+1, right);
		return(i+1); 
	}
	public static void sort(int[] arr, int left, int right) {
		if(left < right) {
			int p = partition(arr, left, right);
			sort(arr, left, p-1);
			sort(arr, p+1, right);
		}
	}
}