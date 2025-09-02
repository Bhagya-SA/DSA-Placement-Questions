public class DiameterOfBinaryTree {
    static int maxDiameter = 0;

    public static int height(TreeNode root){
        if(root == null) return 0;
        int left = height(root.left);
        int right = height(root.right);
        maxDiameter = Math.max(maxDiameter, left + right);
        return 1 + Math.max(left, right);
    }

    public static int diameter(TreeNode root){
        maxDiameter = 0;
        height(root);
        return maxDiameter;
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("Diameter: " + diameter(root));
    }
}

/*
Optimal Approach: Single DFS traversal
Time Complexity: O(n)
Space Complexity: O(h) - recursion stack
*/
