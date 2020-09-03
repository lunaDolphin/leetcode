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
        cur.right = new TreeNode(7);

        System.out.println(maxDepth(root));
    }
    public static int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }

        int cnt = 0;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            while(size > 0){
                TreeNode tn = q.poll();
                if(tn.left != null){
                    q.offer(tn.left);
                }
                if(tn.right != null){
                    q.offer(tn.right);
                }
            size--;
            }
            cnt++;
        }
       return cnt;
    }

}
