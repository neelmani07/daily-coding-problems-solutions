import java.util.*;
import java.io.*;
import java.lang.*;

class MinSpanTree
{
	class Edge implements Comparable<Edge>
	{
		int src;
		int weight;
		int dest;
		
		
		public int compareTo(Edge compedge)
		{
			return this.weight-compedge.weight;
		}
	};
	Edge edges[];
	int V,E;
	
	MinSpanTree( int v, int e)
	{
		V=v;
		E=e;
		edges= new Edge[E];
		for(int i=0;i<e;i++)
		{
			edges[i]=new Edge();
		}
	}
	class Subsets
	{
		int parent;
		int rank;
	};
	int findP(Subsets sub[],int i)
	{	
		
		if(sub[i].parent != i)
			sub[i].parent=findP(sub,sub[i].parent);
			
		return sub[i].parent;
	}
	void union(Subsets subsets[],int x, int y)
	{
		int xroot=findP(subsets,x);
		int yroot=findP(subsets,y);
		
		if(subsets[xroot].rank > subsets[yroot].rank)
			subsets[xroot].parent=yroot;
					
		if(subsets[xroot].rank < subsets[yroot].rank)
			subsets[yroot].parent=xroot;
		else
			subsets[yroot].parent=xroot;
			subsets[xroot].rank++;
	}
	void KruskalMST()
	{
		Arrays.sort(edges);
		
		Edge result[]= new Edge[V];
		for(int i=0;i<V;i++)
		{
			result[i]=new Edge();
		}
		int rV=0;
		 
		Subsets subs[]=new Subsets[V];
		for(int i=0;i<V;i++)
		{
			subs[i]=new Subsets();
			subs[i].parent=i;
			subs[i].rank=0;
		}
		
		int k=0;
		int o=0;
		for(;o<V-1;o++)
		{
			Edge nextEdge= new Edge();
			nextEdge=edges[k++];
			
			
			int xP=findP(subs, nextEdge.src);
			int yP=findP(subs, nextEdge.dest);
			 
			if(xP != yP)
			{
				union(subs,xP,yP);
				result[o]=nextEdge;
			}
		}
		System.out.println("Following are the edges in the constructed MST"); 
		for (int i = 0; i < o; ++i) 
			System.out.println(result[i].src+" -- " + 
				result[i].dest+" == " + result[i].weight); 
	} 
	public static void main(String arg[])
	{
		
		int V = 4; // Number of vertices in graph 
		int E = 5; // Number of edges in graph 
	 	MinSpanTree mst=new MinSpanTree(V,E);

		// add edge 0-1 
		mst.edges[0].src = 0; 
		mst.edges[0].dest = 1; 
		mst.edges[0].weight = 10; 

		// add edge 0-2 
		mst.edges[1].src = 0; 
		mst.edges[1].dest = 2; 
		mst.edges[1].weight = 6; 

		// add edge 0-3 
		mst.edges[2].src = 0; 
		mst.edges[2].dest = 3; 
		mst.edges[2].weight = 5; 

		// add edge 1-3 
		mst.edges[3].src = 1; 
		mst.edges[3].dest = 3; 
		mst.edges[3].weight = 15; 

		// add edge 2-3 
		mst.edges[4].src = 2; 
		mst.edges[4].dest = 3; 
		mst.edges[4].weight = 4; 

		mst.KruskalMST(); 
	} 
} 
			
					
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
