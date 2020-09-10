

public class App {

    public static boolean flag;
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
        flag = true;
        check(p,q);
        return flag;
    }

    public static void check(TreeNode p, TreeNode q){
        if(p == null && q == null) return;
        else if(p == null || q == null) {
            flag = false;
            return;
        }
        if(p.val != q.val){
            flag = false;
            return;
        } 
        check(p.left, q.left);
        check(p.right, q.right);
       return;
    }
}
