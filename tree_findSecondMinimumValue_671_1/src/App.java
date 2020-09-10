import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class App {
    public static void main(String[] args) throws Exception {
        TreeNode root = new TreeNode(2);
        TreeNode cur;
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        cur = root.right;
        cur.left = new TreeNode(5);
        cur.right = new TreeNode(7);
        System.out.println(findSecondMinimumValue(root));
    }

    public static int findSecondMinimumValue(TreeNode root) {
        if(root == null ) return -1;
        int min = root.val;
        Queue<TreeNode> q = new LinkedList<>();
        
            q.offer(root);

        while(!q.isEmpty()){
            int size = q.size();
            int[] num = new int[size];
            while(size > 0){
                TreeNode buf = q.poll();
                int index = 0;
                if(buf.val > min){
                 num[index++] = buf.val;
                }
                if(buf.left != null){
                    q.offer(buf.left);
                    q.offer(buf.right);
                }
                size--;
            }
            Arrays.sort(num);
            if(num[0] != min && num[0] != 0) return num[0];
        }
       return -1;
        
    }

   
}
