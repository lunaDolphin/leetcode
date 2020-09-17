public class App {

    static boolean flag = false;
    static boolean match = true;
    public static void main(String[] args) throws Exception {
        TreeNode s = new TreeNode(1);
        s.left = new TreeNode(1);

        TreeNode t = new TreeNode(1);
        System.out.println(isSubtree(s, t));

    }

   private static boolean isSubtree(TreeNode s, TreeNode t) {
       if(s == null && t == null) return true;
       else if(s == null | t == null) return false;
      
       if(s.val == t.val){
          check(s,t);
          if(match == true){
               flag = true;
               return flag;
          }  
       } 
       return  isSubtree(s.left, t) ||  isSubtree(s.right, t);
   }

   private static void check(TreeNode s, TreeNode t){
       if( s == null && t == null) return;
       else if(s == null || t == null || s.val != t.val){
           match = false;
           return;
       }
       check(s.right, t.right);
       check(s.left, t.left);
      return;
   }
}
