 import java.util.Arrays;
 
 public class practical
 {
     public static final int RANGE = 513;
  
     // using the counting sort algorithm
     public static void countSort(int[] arr)
     {
         //array to store counts of elements in the input array
         int[] freq = new int[RANGE];
  
         // using the value of elements in the input array as an index,
         // update their frequencies in the new array
         for (int i: arr) {
             freq[i]++;
         }
  
         // overwrite the input array with sorted order
         int k = 0;
         for (int i = 0; i < RANGE; i++)
         {
             while (freq[i]-- > 0) {
                 arr[k++] = i;
             }
         }
     }
  
     public static void main(String[] args)
     {
    	// Count 45 = 10 , 76 = 10 , 187 = 15 ,  231 = 10 , 512 = 3
         int[] arr = {0,76,231,187,512,45,45,187,231,512,76,187,512,
        		 76,231,187,512,45,45,187,231,512,76,187,512,
        		 76,231,187,512,45,45,187,231,512,76,187,512,
        		 76,231,187,512,45,45,187,231,512,76,187,512,
        		 76,231,187,512,45,45,187,231,512,76,187,512};
         
         //print initial array
         System.out.println("Original array : ");
         System.out.println(Arrays.toString(arr));
         //calculate starttime
         long startTime = System.nanoTime();
         countSort(arr);
         //calculate endtime
 		 long endTime = System.nanoTime();
 		 //calculate elapsedtime
 		 long elapsedTime = endTime - startTime;
 		 System.out.println();
 		 //print sorted array
         System.out.println("Sorted array : ");
         System.out.println(Arrays.toString(arr));
         System.out.println();
         System.out.println("Time elapsed by count sort : " + elapsedTime + " nanoseconds");
     }
 
}

