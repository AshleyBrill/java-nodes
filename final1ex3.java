import java.util.Arrays;
public class final1ex3 {
	public static void main(String[] args) {
		int[] arr = {4, 77, 98, 30, 20, 50, 77, 22, 49, 2};
		sort(arr, 0, arr.length-1);

		System.out.println(Arrays.toString(arr));

	}
	public static void merge(int arr[], int left, int mid, int right) {
		int n1 = mid - left + 1;
		int n2 = right - mid;

		int l[] = new int[n1];
		int r[] = new int[n2];

		for(int i = 0; i < n1; i++) {
			l[i] = arr[left + i];
		}
		for(int j = 0; j < n2; j++) {
				r[j] = arr[mid + 1 + j];
		}
		int i = 0;
		int j = 0;

		int k = left;

		while(i < n1 && j < n2) {
			if(l[i] <= r[j]) {
				arr[k] = l[i];
				i++;
			}
			else {
				arr[k] = r[j];
				j++;
			}
			k++;
		}
		while(i < n1) {
			arr[k] = l[i];
			i++;
			k++;
		}
		while(j < n2) {
			arr[k] = r[j];
			j++;
			k++;
		}
	}
	public static void sort(int arr[], int l, int r) {
		if(l < r) {
			int m = l + (r - l) / 2;
			sort(arr, l, m);
			sort(arr, m + 1 , r);
			merge(arr, l, m, r);
		}
	}
}