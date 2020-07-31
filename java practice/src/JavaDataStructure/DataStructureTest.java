package JavaDataStructure;

public class DataStructureTest {
    public static void main(String[] args) {
        int[] array = {2,3,4,7,9,44,12,88};
        segmentTree s1 = new segmentTree(array);
        System.out.println(s1.querySum(4, 7));
        s1.updateTree(3, 70);
        System.out.println(s1.querySum(3, 4));
    }
}
