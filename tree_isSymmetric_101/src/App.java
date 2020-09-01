

public class App {
    public static void main(String[] args) throws Exception {
        TreeNode root = new TreeNode(3);
        TreeNode cur;
        root.left = new TreeNode(9);
        // root.right = new TreeNode(20);
        // cur = root.right;

        // cur.left = new TreeNode(15);
        // cur.right = new TreeNode(7);

        System.out.println(isSymmetric(root));
    }
    
    public static boolean isSymmetric(TreeNode root) {
        return   check(root, root);
     }
 
     public static boolean check(TreeNode p, TreeNode q){
         if(q == null && p ==null){
             return true;
         }
         if(q == null && p !=null  || q != null && p == null){
             return false;
         }
         return q.val == p.val && check(q.left,p.right) && check(q.right, p.left);
     }
}
