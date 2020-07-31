package JavaDataStructure;

public class segmentTree {
    public static SegmentTreeNode build(int start, int end, int[] array) {
        if (start == end) {
            return new SegmentTreeNode(start, end, array[start]);

        }
        int mid = (end + start) / 2;
        SegmentTreeNode left = build(start, mid, array);
        SegmentTreeNode right = build(mid + 1, end, array);

        return new SegmentTreeNode(start, end, left.sum + right.sum, left, right);

    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,55,64,2,2};
        SegmentTreeNode a = build(0, array.length - 1, array);

    }
}
