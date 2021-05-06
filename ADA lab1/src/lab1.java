//sort using selection, bubble and insertion sort

import java.util.*;
public class lab1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long OverallstartTime = System.currentTimeMillis();
		int arr[] = new int[10000];
		Random rand = new Random();
		for( int i =0 ; i< arr.length ; i++)
		{
			arr[i] = rand.nextInt(1001);
		}
		int arr1[] = Arrays.copyOf(arr,10000);
	    int arr2[] = Arrays.copyOf(arr,10000);
		System.out.println("Unsorted array");
		print(arr);
		System.out.println();
		System.out.println();
		System.out.println("Sorted array using bubble sort");
		long startTime = System.currentTimeMillis();
		bubble_sort(arr);
		long endTime = System.currentTimeMillis();
		long elapsedTime = endTime - startTime;
//		print(arr);
		System.out.println();
	    System.out.println("Time elapsed by bubble sort : " + elapsedTime + " milliseconds");
		
	    System.out.println();
		System.out.println("Sorted array using selection sort");
		startTime = System.currentTimeMillis();
		selection_sort(arr1);
		endTime = System.currentTimeMillis();
		elapsedTime = endTime - startTime;
//		print(arr1);
		System.out.println();
	    System.out.println("Time elapsed by selection sort : " + elapsedTime + " milliseconds");
		
	    System.out.println();
		System.out.println("Sorted array using insertion sort");
		startTime = System.currentTimeMillis();
		insertion_sort(arr2);
		endTime = System.currentTimeMillis();
		elapsedTime = endTime - startTime;
//		print(arr2);
		System.out.println();
	    System.out.println("Time elapsed by selection sort : " + elapsedTime + " milliseconds");
		
	    long OverallendTime = System.currentTimeMillis();
	    elapsedTime = OverallendTime - OverallstartTime;
	    System.out.println();
	    System.out.println();
	    System.out.println("Overall Time elapsed : " + elapsedTime + " milliseconds");
	}


private static void print(int[] arr) {
	for(int i=0 ; i< arr.length ; i++)
	{
	System.out.println(arr[i]);
	}
	
}

private static void bubble_sort(int[] arr) {
	for(int i=0; i<arr.length ; i++)
	{
		for(int j=i+1; j<arr.length ; j++)
		{
			if(arr[i]>arr[j])
			{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}
	
}
private static void selection_sort(int[] arr) {
	int i,j=0;
	for(i=0; i<arr.length-1 ; i++)
	{
		int pos = i;
		for(j= i+1; j<arr.length ; j++)
		{
			if(arr[j]<arr[pos])
			{
				pos=j;
			}
		}
		int temp = arr[pos];
		arr[pos] = arr[i];
		arr[i] = temp;
	}
	
}
private static void insertion_sort(int[] arr) {
	int n = arr.length; 
    for (int i = 1; i < n; ++i) { 
        int key = arr[i]; 
        int j = i - 1; 
        while (j >= 0 && arr[j] > key) { 
            arr[j + 1] = arr[j]; 
            j = j - 1; 
        } 
        arr[j + 1] = key; 
    } 
	
}
}
