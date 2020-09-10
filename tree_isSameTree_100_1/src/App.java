public class App {
    public static void main(String[] args) throws Exception {
        TreeNode p = new TreeNode(3);
        TreeNode q = new TreeNode(3);

        p.left = new TreeNode(9);
        q.left = new TreeNode(9);

        p.right = new TreeNode(20);
        q.right = new TreeNode(20);
        
        System.out.println(isSameTree(p, q));
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        } else if(p == null || q == null){
            return false;
        } else if(p.val != q.val){
            return false;
        } else{
           return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
    }
}
