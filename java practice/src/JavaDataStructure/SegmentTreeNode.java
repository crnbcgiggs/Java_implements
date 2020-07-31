package JavaDataStructure;



public class SegmentTreeNode {
    public int start;
    public int end;
    public int sum;
    SegmentTreeNode left;
    SegmentTreeNode right;
    public SegmentTreeNode(int start, int end, int sum) {
        this.start = start;
        this.end = end;
        this.sum = sum;
    }
    public SegmentTreeNode(int start, int end, int sum, SegmentTreeNode left, SegmentTreeNode right) {
        this(start, end, sum);
        this.left = left;
        this.right = right;

    }
}
