import java.util.*;

public class GraphDFS_BFS {
    private int V;
    private LinkedList<Integer>[] adj;

    public GraphDFS_BFS(int V){
        this.V = V;
        adj = new LinkedList[V];
        for(int i=0;i<V;i++) adj[i] = new LinkedList<>();
    }

    public void addEdge(int u, int v){
        adj[u].add(v);
        adj[v].add(u); // undirected graph
    }

    public void BFS(int s){
        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();
        visited[s] = true;
        queue.offer(s);

        while(!queue.isEmpty()){
            int node = queue.poll();
            System.out.print(node + " ");
            for(int neighbor : adj[node]){
                if(!visited[neighbor]){
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }
    }

    public void DFSUtil(int v, boolean[] visited){
        visited[v] = true;
        System.out.print(v + " ");
        for(int neighbor : adj[v]){
            if(!visited[neighbor]) DFSUtil(neighbor, visited);
        }
    }

    public void DFS(int s){
        boolean[] visited = new boolean[V];
        DFSUtil(s, visited);
    }

    public static void main(String[] args){
        GraphDFS_BFS g = new GraphDFS_BFS(5);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,3);
        g.addEdge(1,4);

        System.out.print("BFS: "); g.BFS(0); System.out.println();
        System.out.print("DFS: "); g.DFS(0); System.out.println();
    }
}

/*
Optimal Approach: BFS uses Queue, DFS uses recursion
Time Complexity: O(V + E)
Space Complexity: O(V) - visited array + recursion/queue
*/
