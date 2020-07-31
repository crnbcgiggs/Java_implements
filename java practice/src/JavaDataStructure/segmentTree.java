package JavaDataStructure;

public class segmentTree {
    public static SegmentTreeNode buildTree(int start, int end, int[] array) {
        if (start == end) {
            return new SegmentTreeNode(start, end, array[start]);

        }
        int mid = start + (end - start) / 2;
        SegmentTreeNode left = buildTree(start, mid, array);
        SegmentTreeNode right = buildTree(mid + 1, end, array);

        return new SegmentTreeNode(start, end, left.sum + right.sum, left, right);

    }
    public static void updateTree(SegmentTreeNode root, int index, int val) {
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

    public static void main(String[] args) {
        int[] array = {1,2,3,4,55,64,2,2};
        SegmentTreeNode a = buildTree(0, array.length - 1, array);
        updateTree(a, 3, 52);


    }
}
