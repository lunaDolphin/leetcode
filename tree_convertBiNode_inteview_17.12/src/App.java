public class App {
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
        if(root == null) return null;
        
        TreeNode buf = convertBiNode (root.left);        
        if(buf == null){
            buf = root;
        } else{
            TreeNode tmp = buf;
            while(buf.right != null){
                buf = buf.right;
            }
            buf.right = root;
            buf = tmp;
        }
       
        root.left = null;
        root.right = convertBiNode(root.right);
        
        return buf;
}
}