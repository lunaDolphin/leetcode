public class App {
    public static void main(String[] args) throws Exception {
        TreeNode s = new TreeNode(4);
        s.left = new TreeNode(4);
        s.right = new TreeNode(5);
        s.left.left = new TreeNode(1);
        s.left.right = new TreeNode(2);

        TreeNode t = new TreeNode(4);
        t.left = new TreeNode(1);
        t.right = new TreeNode(2);

        System.out.println(isSubtree(s, t));

    }

   private static boolean isSubtree(TreeNode s, TreeNode t) {
       if(s == null && t == null) return true;
       if(s == null | t == null) return false;
       Integer.MIN_VALUE
       return  check(s,t) || isSubtree(s.left, t) ||  isSubtree(s.right, t);
   }

   private static boolean check(TreeNode s, TreeNode t){
       if( s == null && t == null) return true;
       if(s == null || t == null || s.val != t.val){
           return false;
       }
       return check(s.right, t.right) && check(s.left, t.left);
   }
}
