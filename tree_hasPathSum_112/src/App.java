import java.util.LinkedList;
import java.util.Queue;

public class App {
    public static void main(String[] args) throws Exception {
        TreeNode root = new TreeNode(3);
        TreeNode cur;
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        cur = root.right;

        cur.left = new TreeNode(15);
        cur.right = new TreeNode(8);

        System.out.println(hasPathSum(root,30));
    }

    public static boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) return false;
        Queue <TreeNode> q = new LinkedList<>();

        q.offer(root);
        root.sum = root.val;
        while(!q.isEmpty()){
            
            int size = q.size();
            while(size > 0){
                TreeNode tn = q.poll();
                if(tn.left == null && tn.right == null){
                    if(tn.sum == sum) return true;
                }
                if(tn.left != null){
                    q.offer(tn.left);
                    tn.left.sum = tn.sum + tn.left.val;
                }
                if(tn.right != null){
                    q.offer(tn.right);
                    tn.right.sum = tn.sum + tn.right.val;
                }
                size--;
            }
        }
        return false;
    }
    

}
