package JavaDataStructure;

public class segmentTree {
    public static SegmentTreeNode buildTree(int start, int end, int[] array) {
        if (start == end) {
            return new SegmentTreeNode(start, end, array[start]);

        }
        int mid = (end + start) / 2;
        SegmentTreeNode left = buildTree(start, mid, array);
        SegmentTreeNode right = buildTree(mid + 1, end, array);

        return new SegmentTreeNode(start, end, left.sum + right.sum, left, right);

    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,55,64,2,2};
        SegmentTreeNode a = buildTree(0, array.length - 1, array);

    }
}
