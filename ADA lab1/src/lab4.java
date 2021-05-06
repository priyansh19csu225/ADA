import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;
//Fractional knapsack
public class lab4 {
	public static void main(String[] args) {
		int n;
		int capacity;
		int wt[] = new int[5];
		int val[] = new int[5];
		Random rand = new Random();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of items");
		n= sc.nextInt();
		System.out.println("Enter the capacity of items");
		capacity= 150;
		for(int i=0 ; i<n ; i++)
		{
			wt[i] = rand.nextInt(100);
			val[i] = rand.nextInt(1000);
			System.out.println("Weight " + wt[i] + " " + val[i]);
		}
		 double maxValue = getMaxValue(wt, val, capacity);

	      
	        System.out.println("Maximum value we can obtain = "
	                           + maxValue);
	}



    private static double getMaxValue(int[] wt, int[] val,
                                      int capacity)
    {
        ItemValue[] iVal = new ItemValue[wt.length];
 
        for (int i = 0; i < wt.length; i++) {
            iVal[i] = new ItemValue(wt[i], val[i], i);
        }
        

        Arrays.sort(iVal, new Comparator<ItemValue>() {
            @Override
            public int compare(ItemValue o1, ItemValue o2)
            {
                return o2.cost.compareTo(o1.cost);
            }
        });

 
        double totalValue = 0d;
 
        for (ItemValue i : iVal) {
 
            int curWt = (int)i.wt;
            int curVal = (int)i.val;
            int index = (int)i.ind;
 
            if (capacity - curWt >= 0) {
                capacity = capacity - curWt;
                totalValue += curVal;
                System.out.println((double)curWt + " item " + (int)(index+1) );
            }
            else {
    
                double fraction
                    = ((double)capacity / (double)curWt);
                totalValue += (curVal * fraction);
                capacity
                    = (int)(capacity - (curWt * fraction));
                System.out.println(curWt*fraction + " item " + (int)(index+1));
                break;
            }
        }
 
        return totalValue;
    }
 
 
    static class ItemValue {
        Double cost;
        double wt, val, ind;
 
      
        public ItemValue(int wt, int val, int ind)
        {
            this.wt = wt;
            this.val = val;
            this.ind = ind;
            cost = new Double((double)val / (double)wt);
        }
        
    }

 

}
