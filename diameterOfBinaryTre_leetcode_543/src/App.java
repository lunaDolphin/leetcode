public class App {
    public static int max = Integer.MIN_VALUE;

    public static void main(String[] args) throws Exception {
        TreeNode s = new TreeNode(1);
        s.left = new TreeNode(2);
        s.right = new TreeNode(3);
        s.left.left = new TreeNode(4);
        s.left.right = new TreeNode(5);

        // TreeNode t = new TreeNode(4);
        // t.left = new TreeNode(1);
        // t.right = new TreeNode(2);

        System.out.println(diameterOfBinaryTree(s));

    }

    
    public static int diameterOfBinaryTree(TreeNode root) {
        if(root == null) max = 0;
        if(root.right == null && root.left == null) return 0;
        check(root);
        return max;
    }

    public static int check(TreeNode root){
        if(root == null) return 0;
        int left = check(root.left);
        int right = check(root.right);
        max = Math.max(max, left + right);
        return Math.max(left, right) + 1;
    }
}
