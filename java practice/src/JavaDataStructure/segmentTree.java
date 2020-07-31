package JavaDataStructure;

public class segmentTree {
    private SegmentTreeNode TreeRoot;
    public segmentTree(int[] array){
        this.TreeRoot = buildTree(0, array.length - 1, array);
    }
    private SegmentTreeNode buildTree(int start, int end, int[] array) {
        if (start == end) {
            return new SegmentTreeNode(start, end, array[start]);

        }
        int mid = start + (end - start) / 2;
        SegmentTreeNode left = buildTree(start, mid, array);
        SegmentTreeNode right = buildTree(mid + 1, end, array);

        return new SegmentTreeNode(start, end, left.sum + right.sum, left, right);
    }
    private void updateTree(SegmentTreeNode root, int index, int val) {
        if (root.start == root.end && root.start == index) {
            root.sum = val;
            return;
        }
        int mid = root.start + (root.end - root.start) / 2;
        if (index <= mid) {
            updateTree(root.left, index, val);
        }
        else {
            updateTree(root.right, index, val);
        }
        root.sum = root.left.sum + root.right.sum;
    }
    private int querySum(SegmentTreeNode root, int start, int end) {
        if (start == root.start && end == root.end) {
            return root.sum;
        }
        int mid = root.start + (root.end - root.start) / 2;
        if (end <= mid) {
            return querySum(root.left, start, end);
        }
        if (start >= mid + 1) {
            return querySum(root.right, start, end);
        }
        else {
            return querySum(root.left, start, mid) + querySum(root.right, mid + 1, end);
        }
    }

    public void updateTree(int index, int val) {
        updateTree(TreeRoot, index, val);
    }
    public int querySum(int start, int end) {
        return querySum(TreeRoot, start, end);
    }
}
