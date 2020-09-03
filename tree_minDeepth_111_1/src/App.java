import java.util.LinkedList;
import java.util.Queue;

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
        // if(root.left == null && root.right == null){
        //     return 1;
        // }
        Queue<TreeNode> q = new LinkedList<>();
    
        q.offer(root);
       int cnt = 0;
        while(!q.isEmpty()){
            
            int size = q.size();
            while(size > 0){
                TreeNode tn = q.poll();
                if(tn.left == null && tn.right == null){
                   return ++cnt;
                }
                if(tn.right != null){
                    q.offer(tn.right);
                }
                if(tn.left != null){
                    q.offer(tn.left);
                }
                size--;
            }
            cnt++;
            
        }

        return cnt;
    }

}
