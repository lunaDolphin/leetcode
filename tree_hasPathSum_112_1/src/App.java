import java.util.LinkedList;
import java.util.Queue;

public class App {

    static int result = 0;
    static boolean flag = false;

    public static void main(String[] args) throws Exception {
        TreeNode root = new TreeNode(5);
        TreeNode cur;
        TreeNode cur_right;
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);

        cur = root.right;
        cur.left = new TreeNode(13);
        cur.right = new TreeNode(4);
        cur_right = cur.right;
        cur_right.right = new TreeNode(1);

        cur = root.left;
        cur.left = new TreeNode(11);
        
        cur = cur.left;
        cur.left = new TreeNode(7);
        cur.right = new TreeNode(2);

        System.out.println(hasPathSum(root, 22));
    }

    public static boolean hasPathSum(TreeNode root, int sum) {
        result = sum;
        check(root, 0);
        return flag;
    }
    
    public static void check(TreeNode root, int sum){
        if (root == null)
            return;

        sum += root.val;
        System.out.println(sum);
        if(root.right == null && root.left == null){
            if(result == sum){
                flag = true;
                return;
            }
        }
        
        check(root.right, sum);
        check(root.left, sum);
    }
}

