import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
//Prims Algorithm
public class lab5 {

	 private static final int V = 5;    //no.of vertices

	 void prims(int graph[][]) 
	 {     
	     int mstlist[] = new int[V]; 
	     int key[] = new int[V];  
	     Boolean mstSet[] = new Boolean[V]; 
	     for (int i = 0; i < V; i++) { 
	         key[i] = Integer.MAX_VALUE; 
	         mstSet[i] = false; 
	     } 
	     key[0] = 0; 
	     mstlist[0] = -1;

	     for (int count=0; count<V-1;count++) {       
	    	//u=min_index
	    	 int min=Integer.MAX_VALUE,u=-1;
		     for (int v = 0; v < V; v++) 
		         if (mstSet[v] == false && key[v]<min) { 
		             min = key[v]; 
		             u= v; 
		         } 
 
	         mstSet[u]= true; 

	         for (int v = 0; v < V; v++) 
	             if (graph[u][v]!=0 && mstSet[v]==false && graph[u][v]<key[v]) //smallest key vert not in mst set
	             { 
	                 mstlist[v] = u; 
	                 key[v] = graph[u][v]; 
	             } 
	     } 

		 int sum=0;
	     System.out.println("Edge \tWeight"); 
	     for (int i = 1; i < V; i++) {
	         System.out.println(mstlist[i] + " - " + i + "\t" + graph[i][mstlist[i]]); 
	     	sum=sum+graph[i][mstlist[i]];}
	     System.out.println("sum of weight="+sum); 
	 }
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	FileWriter writer = new FileWriter("C:\\Users\\Admin\\Desktop\\ADA\\Prim.txt", true);
	BufferedWriter bufferedWriter = new BufferedWriter(writer);
	System.out.println("");
	
		lab5 t = new lab5(); 
	     int graph[][] = new int[][] { { 0,9,5,2,0 }, 
	                                   {9,0,0,6,5}, 
	                                   {5,0,0,4,5}, 
	                                   {2,6,4,0,4 }, 
	                                   {0,5,5,4,0} }; 
	          bufferedWriter.newLine();
	         for (int i = 0; i < 5; i++) {
	        	 bufferedWriter.write("Vertex " + i + "--->");
	            for (int j = 0; j <5 ; j++) {
	            if(graph[i][j]!=0){
	           bufferedWriter.write(j + " ");
	                  }
	            	}
	            bufferedWriter.newLine();
	            }
	try {
		bufferedWriter.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  t.prims(graph); 
	}

}

/*----output in TEXT FILE -----
Ad. list

Vertex 0--->1 3 
Vertex 1--->0 2 3 4 
Vertex 2--->1 4 
Vertex 3--->0 1 4 
Vertex 4--->1 2 3 
*/
