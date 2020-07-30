package enumPractice;

public class EnumTest {
    public static void main(String[] args) {
        //values()方法：返回枚举类型的对象数组。该方法可以很方便地遍历所有的枚举值。
        Season1[] values = Season1.values();
        for (int i = 0; i < values.length; i ++) {
            System.out.println(values[i]);
        }

        //valueOf(String str)：可以把一个字符串转为对应的枚举类对象。要求字符串必须是枚举类对象的“名字”。如不是，会有运行时异常：IllegalArgumentException。
        Season1 winter = Season1.valueOf("WiNTER");
        System.out.println(winter.getSeasonName());
    }
}
