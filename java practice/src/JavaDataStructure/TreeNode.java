package JavaDataStructure;

//here we have a class TreeNode which is comparable with natural order;



public class TreeNode implements Comparable<TreeNode>{
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int val) {
        this.val = val;
    }
    @Override
    public int compareTo(TreeNode b) {
        if (this.val == b.val) {
            return 0;
        }
        return this.val < b.val ? -1 : 1;
    }
}

