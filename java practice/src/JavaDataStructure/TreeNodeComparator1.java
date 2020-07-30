package JavaDataStructure;

import java.util.Comparator;

public class TreeNodeComparator1 implements Comparator<TreeNode> {
    @Override
    public int compare(TreeNode a, TreeNode b) {
        if (a.val == b.val) {
            return 0;
        }
        return a.val > b.val ? -1 : 1;
    }

}
