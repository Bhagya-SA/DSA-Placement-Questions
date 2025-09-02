public class RatInMaze {
    public static void solveMaze(int[][] maze){
        int n = maze.length;
        int[][] path = new int[n][n];
        if(findPath(maze, 0, 0, path)){
            printPath(path);
        } else {
            System.out.println("No path found");
        }
    }

    private static boolean findPath(int[][] maze, int x, int y, int[][] path){
        int n = maze.length;
        if(x == n-1 && y == n-1 && maze[x][y] == 1){
            path[x][y] = 1;
            return true;
        }

        if(isSafe(maze, x, y)){
            path[x][y] = 1;

            if(findPath(maze, x+1, y, path)) return true;
            if(findPath(maze, x, y+1, path)) return true;

            path[x][y] = 0; // backtrack
            return false;
        }
        return false;
    }

    private static boolean isSafe(int[][] maze, int x, int y){
        int n = maze.length;
        return (x>=0 && x<n && y>=0 && y<n && maze[x][y]==1);
    }

    private static void printPath(int[][] path){
        for(int[] row : path){
            for(int cell : row) System.out.print(cell + " ");
            System.out.println();
        }
    }

    public static void main(String[] args){
        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
        };
        solveMaze(maze);
    }
}

/*
Optimal Approach: Backtracking to explore all paths
Time Complexity: O(2^(N^2)) - worst case, exploring all cells
Space Complexity: O(N^2) - path storage + recursion stack
*/
