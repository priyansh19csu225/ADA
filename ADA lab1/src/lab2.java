
import java.util.*;
public class lab2 {

	public static void main(String[] args) {
	int flag = 0;
	while(flag<50) {
		int arr[] = new int[10000];
		int arr1[] = new int[10000];
		Random rand = new Random();
		for( int i =0 ; i< arr.length ; i++)
		{
			arr[i] = rand.nextInt(1001);
			arr1[i] = 999;
		}
		long startTime = System.currentTimeMillis();
		mergeSort(arr,0,arr.length-1);
		long endTime = System.currentTimeMillis();
		long elapsedTime = endTime - startTime;
		System.out.println("Time elapsed in random array : " + elapsedTime + " milliseconds");
		
		startTime = System.currentTimeMillis();
		mergeSort(arr,0,arr.length-1);
		endTime = System.currentTimeMillis();
		elapsedTime = endTime - startTime;
		System.out.println("Time elapsed in ascending sorted array : " + elapsedTime + " milliseconds");
		
		reverse(arr, arr.length);
		startTime = System.currentTimeMillis();
		mergeSort(arr,0,arr.length-1);
		endTime = System.currentTimeMillis();
		elapsedTime = endTime - startTime;
		System.out.println("Time elapsed in descending sorted array : " + elapsedTime + " milliseconds");
		
		startTime = System.currentTimeMillis();
		mergeSort(arr1,0,arr1.length-1);
		endTime = System.currentTimeMillis();
		elapsedTime = endTime - startTime;
		System.out.println("Time elapsed in same elements array : " + elapsedTime + " milliseconds");
		
		System.out.println();
		flag ++;
	}
	
	}
	public static void mergeSort(int[] arr, int lowerIndex, int upperIndex) {
		if (lowerIndex == upperIndex) return;
		else {
			int midIndex = (lowerIndex + upperIndex)/2;
			mergeSort(arr, lowerIndex, midIndex);
			mergeSort(arr, midIndex+1, upperIndex);
			merge(arr, lowerIndex, midIndex, upperIndex);
		}
		
	}
	
	public static void merge(int[] arr, int lowerIndex, int midIndex, int upperIndex) {
	
		int tempArr[] = new int[arr.length];
		for (int i=lowerIndex; i<=upperIndex; i++) {
			tempArr[i] = arr[i];
		}
		int i = lowerIndex;
		int j = midIndex+1;
		int k = lowerIndex;
		while (i<=midIndex && j <=upperIndex) {
			if (tempArr[i] <= tempArr[j]) {
				arr[k] = tempArr[i];
				i++;
			}
			else {
				arr[k] = tempArr[j];
				j++;
			}
			k++;
		}

		while (i<=midIndex) {
			arr[k] = tempArr[i];
			k++;
			i++;
		}
		
		while (j<=upperIndex) {
			arr[k] = tempArr[j];
			k++;
			j++;
		}
	}

	static void reverse(int a[], int n) 
    { 
        int[] b = new int[n]; 
        int j = n; 
        for (int i = 0; i < n; i++) { 
            b[j - 1] = a[i]; 
            j = j - 1; 
        } 
    }
}
