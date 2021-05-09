//bellmanFord
public class lab8 {
	static void BellmanFord(int graph[][], int src,int V,int E) 
	 { 
	    int dist[] = new int[V];  
	     for (int i = 0; i < V; ++i) 
	         dist[i] = Integer.MAX_VALUE;     // Initialize vertices as INFINITE
	     dist[src] = 0; 

	     //  Relaxing all edges |V| - 1 times.
     for (int i = 1; i<V; ++i) { 
         for (int j = 0; j < E; ++j) { //src-dest-wght 
             if (dist[graph[j][0]]!=Integer.MAX_VALUE && dist[graph[j][0]]+graph[j][2]<dist[graph[j][1]]) 
                 dist[graph[j][1]]=dist[graph[j][0]]+graph[j][2]; 
         } 
	     } 

     														// check for negative-weight cycles.
	    for (int j = 0; j < E; ++j) { 
	          if (dist[graph[j][0]]!=Integer.MAX_VALUE && dist[graph[j][0]]+graph[j][2]<dist[graph[j][1]]) { 
	        	  System.out.println("negative weight cycle graph"); 
	             return; 
	     } 
	     } 
	     
	    System.out.println("Vertex Distance from Source"); 
	    for (int i = 0; i < V;  ++i) 
	         System.out.println(i +"\t"+ dist[i]); 
	      } 
	public static void main(String[] args) {
		// TODO Auto-generated method stud
		System.out.println(); 
	     int V = 5; //  vertices 
	     int E = 8; // edges 
	     System.out.println("GRAPH-1"); 
	     int graph[][]= {{0,1,1},{0,2,-4},   //src,dest.wght
	    		 		{1,2,3},{1,3,2},
	     				  {1,4,2},{3,2,5},
	     				  {3,1,1},{4,3,3}};
	     BellmanFord(graph,0,V,E);
	     System.out.println();
	     System.out.println("GRAPH-2");
	     int graph1[][]= {{0,1,-1},{0,2,-4},      //-ve wghted cycle 0-1,1-3,3-1
	    		 			{1,2,3},{1,3,2},
	     					{1,4,2},{3,2,5},
	     					{3,1,-1},{4,3,-3}};
	     BellmanFord(graph1,0,V,E);
	     
	     
	 } 
	
}
	
