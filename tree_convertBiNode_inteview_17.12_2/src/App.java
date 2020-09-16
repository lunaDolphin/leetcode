import java.util.Deque;
import java.util.LinkedList;

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
        TreeNode home = new TreeNode(-1); //链表头
        TreeNode pre =  home;   
        TreeNode buf = root;

        Deque<TreeNode> q = new LinkedList<>();

       while(buf != null || !q.isEmpty()){
           if(buf != null){
               q.push(buf);
               buf = buf.left;
           }else{
               buf = q.poll();
               buf.left = null;
               pre.right = buf;
               pre = pre.right;

               buf = buf.right;
           }
       }
        return home.right;
}
}