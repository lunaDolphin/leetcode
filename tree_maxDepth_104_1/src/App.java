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
       return root == null ? 0:Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

}
