//author: Prateek Singh
//Assignment: Lab2: Algorithms-DSA
//determine minimum notes for making payment

package com.greatlearning.currencycount.driver;

public class MergeSort {
	void merge(int arr[], int left, int mid, int right) {

		// To find size of 2 subarray to be merged

		int subarray1 = mid - left + 1;
		int subarray2 = right - mid;

		// creating temp array
		int Left[] = new int[subarray1];
		int Right[] = new int[subarray2];

		// copy data to temp array
		for (int i = 0; i < subarray1; i++) {
			Left[i] = arr[left + i];
		}
		for (int j = 0; j < subarray2; ++j) {
			Right[j] = arr[mid + 1 + j];
		}
		// Merge temp array
		// initial index of 1st and 2nd subarray & merged array

		int i = 0, j = 0, k = 0;

		while (i < subarray1 && j < subarray2) {
			if (Left[i] >= Right[j]) {
				arr[k] = Left[i];
				i++;
			} else {
				arr[k] = Right[j];
				j++;
			}
			k++;
		}

		// copy remaining elements of L[] if any

		while (i < subarray1) {
			arr[k] = Left[i];
			i++;
			k++;
		}
		// copy remaining elements of R[] if any
		while (j < subarray2) {
			arr[k] = Right[j];
			j++;
			k++;
		}
	}

	// main function that sorts arr[left..to right] using merge
	void mergeSort(int arr[], int left, int right) {
		if (left < right) {
			// finding middle point
			int mid = left + (right - left) / 2;
			// sort first and second halves
			mergeSort(arr, left, mid);
			mergeSort(arr, mid + 1, right);

			// merge sorted halves
			merge(arr, left, mid, right);
		}
	}
}
