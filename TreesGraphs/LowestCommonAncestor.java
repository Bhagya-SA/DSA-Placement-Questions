public class LowestCommonAncestor {
    public static TreeNode LCA(TreeNode root, TreeNode p, TreeNode q){
        if(root == null || root == p || root == q) return root;
        TreeNode left = LCA(root.left, p, q);
        TreeNode right = LCA(root.right, p, q);
        if(left != null && right != null) return root;
        return (left != null) ? left : right;
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        TreeNode p = root.left; // 5
        TreeNode q = root.left.right.right; // 4
        System.out.println("LCA: " + LCA(root,p,q).val);
    }
}

/*
Optimal Approach: Single DFS traversal
Time Complexity: O(n)
Space Complexity: O(h) - recursion stack
*/
