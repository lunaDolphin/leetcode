public class App {
    public static void main(String[] args) throws Exception {
        TreeNode root = new TreeNode(2);
        // TreeNode cur;
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        // cur = root.right;

        // cur.left = new TreeNode(15);
        // cur.right = new TreeNode(7);

        System.out.println(findSecondMinimumValue(root));
    }

    public static int findSecondMinimumValue(TreeNode root) {
        if(root == null) return -1;
        int min = root.val;
        return  check(root, min);
    }
/**
 * 如果当前节点的值和根节点的不一致，则该值使当前根节点的第二小的值
 * 
 * 把当前节点作为根节点处理时，先获取子节点的返回值，
 * 然后根据返回值的情况，如果有返回值，则获取较小的返回值
 * 两边都没有返回值的话，则返回-1
 * @param root 根节点
 * @param min 根节点的值
 * @return 小于根节点的第二小的值
 */
    public static int check(TreeNode root, int min){
        // if child node's value is different from root node, then current node's value is the second min value
        if(root.val != min) return root.val;
        
        //use curent node as root node
        //if root is a leaf then return -1;
        if(root.right == null) return -1;
        // get the values of child node
        int left = check(root.left, min);
        int right = check(root.right, min);
        // return according to the values of child nodes
        if(left == -1) return right;
        if(right == -1) return left;

        return Math.min(left, right); 

        
    }
}
