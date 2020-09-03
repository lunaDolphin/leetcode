public class App {
    public static void main(String[] args) throws Exception {
        TreeNode root = new TreeNode(3);
        TreeNode cur;
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        cur = root.right;

        cur.left = new TreeNode(15);
        cur.right = new TreeNode(7);

        System.out.println(maxDepth(root));
    }
    public static int maxDepth(TreeNode root) {
        if(root == null){
             return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }

        int max = Integer.MIN_VALUE;
        if(root.left != null){
            max = Math.max(maxDepth(root.left), max);
        }
        if(root.right != null){
            max = Math.max(maxDepth(root.right), max);
        }
        return max + 1;
    }

}
