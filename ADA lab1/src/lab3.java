
//Quicksort
public class lab3 {
    
    public static int count;
    
    static int partition(int arr[], int low, int high) 
    { 
        int pivot = arr[high];  
        int i = (low-1); 
        for (int j=low; j<high; j++) 
        { 
            if (arr[j] < pivot) 
            { 
                i++; 

 

                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
  
        int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
  
        return i+1; 
    } 
    
    
    static void sort(int arr[], int low,  int high) 
    { 
        if (low < high) 
        { 
            int pi = partition(arr, low, high); 
  
            sort(arr, low, pi-1); 
            sort(arr, pi+1, high); 
        } 
        
        count++;
    }
    
    
    public static void main(String args[])
    {
        lab3 ob = new lab3();
        
        
        int i = 0;
        int arr1[] = new int[1000];
        int arr2[] = new int[1000];
        int arr3[] = new int[1000];
        int arr4[] = new int[1000];
        
        //random number array
        for(i=0;i<1000;i++) {
            int x = (int)(Math.random()*1000000000);
            arr1[i] = x;
        }
        
        
        //same number array
        int y = 4587563;
        for(i=0;i<1000;i++) {
            arr2[i] = y;
        }
        
        //descending number array
        int z = 245986;
        for(i=0;i<1000;i++) {
            arr3[i] = z;
            z=z-1;
        }
        
        //ascending number array
        int a = 574892;
        for(i=0;i<1000;i++) {
            arr4[i] = a;
            a=a+1;
        }
        
        long start1, start2, start3, start4, end1, end2, end3, end4;
        
        count=0;
        start1 = System.nanoTime();
        sort(arr1, 0, arr1.length - 1);
        end1 = System.nanoTime();
        System.out.println("time for random numbers : "+ (end1-start1)+" ns");
        System.out.println("count = "+ob.count+"\n");
        
        count=0;
        start2 = System.nanoTime();
        sort(arr2, 0, arr2.length - 1);
        end2 = System.nanoTime();
        System.out.println("time for same numbers : "+ (end2-start2)+" ns");
        System.out.println("count = "+ob.count+"\n");
        
        count=0;
        start3 = System.nanoTime();
        sort(arr3, 0, arr3.length - 1);
        end3 = System.nanoTime();
        System.out.println("time for descending sorted numbers : "+ (end3-start3)+" ns");
        System.out.println("count = "+ob.count+"\n");
        
        count=0;
        start4 = System.nanoTime();
        sort(arr4, 0, arr4.length - 1);
        end4 = System.nanoTime();
        System.out.println("time for ascending sorted numbers : "+ (end4-start4)+" ns");
        System.out.println("count = "+ob.count+"\n");
        
        
        
    }

 

}
