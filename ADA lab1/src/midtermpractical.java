import java.util.Arrays;

public class midtermpractical
 {
  
     // using the counting sort algorithm
     public static void countSort(int[] arr)
     {
        int count_45 = 0;
        int count_76 = 0;
        int count_187 = 0;
        int count_231 = 0;
        int count_512 = 0;
        for( int j = 0 ; j< arr.length ; j++)
        {
        	if(arr[j]==45)
        		count_45 =count_45 + 1;
        	if(arr[j]==76)
        		count_76 = count_76 + 1;
        	if(arr[j]==187)
        		count_187 = count_187 + 1;
        	if(arr[j]==231)
        		count_231 = count_231 + 1;
        	if(arr[j]==512)
        		count_512 = count_512 + 1;
        	
        }
        int i=0;
        int j =0;
        for( ; i<count_45 ; i++)
        {
        	arr[i]=45; 
        	j=i;
        }
        for( ; i<count_76 ; i++)
        {
        	arr[i]=76; 
        }
        for( ; i<count_187 ; i++)
        {
        	arr[i]=187;
        }
        for( ; i<count_231 ; i++)
        {
        	arr[i]=231;
        }
        for( ; i<count_512 ; i++)
        {
        	arr[i]=512;
        }
     }
  
     public static void main(String[] args)
     {
    	// Count 45 = 10 , 76 = 10 , 187 = 15 ,  231 = 10 , 512 = 3 
         int[] arr = {76,231,187,512,45,45,187,231,512,76,187,512};
         
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
