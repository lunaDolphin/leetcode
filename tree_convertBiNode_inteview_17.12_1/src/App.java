public class App {
    private static TreeNode home = new TreeNode(-1);
    private static TreeNode pre = null;
    public static void main(String[] args) throws Exception {
        TreeNode s = new TreeNode(4);
        s.left = new TreeNode(2);
        s.right = new TreeNode(5);
        s.left.left = new TreeNode(1);
        s.left.right = new TreeNode(3);
        s.right.right = new TreeNode(6);
        s.left.left.left = new TreeNode(0);

        TreeNode home = convertBiNode(s);
        while(home != null){
            System.out.println(home.val);
            home = home.right;
        } 
    }

    public static TreeNode convertBiNode(TreeNode root) {
        
        home.right = root;
        check(root);
        return home.right;
}
    public static void check(TreeNode root){
        if(root == null) return;
        check(root.left);
        if(pre == null){
            pre = root;
            home.right = root;
        } else{
            pre.right = root;
            pre = root;
        }
        root.left = null;
        check(root.right);
    }
}