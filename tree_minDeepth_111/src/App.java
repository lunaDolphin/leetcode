
public class App {
    public static void main(String[] args) throws Exception {
        TreeNode root = new TreeNode(3);
        TreeNode cur;
        root.left = new TreeNode(9);
        // root.right = new TreeNode(20);
        // cur = root.right;

        // cur.left = new TreeNode(15);
        // cur.right = new TreeNode(7);

        System.out.println(minDepth(root));
    }

    public static int minDepth(TreeNode root) {

        if(root == null) return 0;
        if(root.right == null && root.left == null) return 1;
    

        int min_len = Integer.MAX_VALUE;
        if(root.left != null){
            min_len = Math.min(minDepth(root.left), min_len);
        }
        if(root.right != null){
            min_len = Math.min(minDepth(root.right), min_len);
        }
        return min_len + 1;
    }

}
