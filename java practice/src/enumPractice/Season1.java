package enumPractice;
//注意，enum里面要写构造器，初始化（前四行）
//* 说明：定义的枚举类默认继承于java.lang.Enum类
/**
 * 一、枚举类的使用
 * 1.枚举类的理解：类的对象只有有限个，确定的。我们称此类为枚举类
 * 2.当需要定义一组常量时，强烈建议使用枚举类
 * 3.如果枚举类中只有一个对象，则可以作为单例模式的实现方式。
 *
 * 二、如何定义枚举类
 * 方式一：jdk5.0之前，自定义枚举类
 * 方式二：jdk5.0，可以使用enum关键字定义枚举类
 *
 * 三、Enum类中的常用方法：
 *    values()方法：返回枚举类型的对象数组。该方法可以很方便地遍历所有的枚举值。
 *    valueOf(String str)：可以把一个字符串转为对应的枚举类对象。要求字符串必须是枚举类对象的“名字”。如不是，会有运行时异常：IllegalArgumentException。
 *    toString()：返回当前枚举类对象常量的名称
 *
 * 四、使用enum关键字定义的枚举类实现接口的情况
 *   情况一：实现接口，在enum类中实现抽象方法
 *   情况二：让枚举类的对象分别实现接口中的抽象方法
 *
 * @author shkstart
 * @create 2019 上午 10:17
 */

public enum Season1 {
    SPRING("春天", "a"),//这里是省略了public static final Season1, 多个对象之间用逗号分隔，结尾用分号
    SUMMER("夏天", "b"),
    AUTUMN("秋天", "c"),
    WINTER("冬天", "d");

//2: 声明Season对象的属性: private final 修饰
    private final String seasonName;
    private final String seasonType;
    private Season1(String name, String type) {
        this.seasonName = name;
        this.seasonType = type;
    }
    // 其他诉求： 获取枚举类对象的属性：
    public String getSeasonName() {
        return seasonName;
    }
    public String getSeasonType() {
        return seasonType;
    }
    @Override
    public String toString(){
        return this.seasonName + " " + this.seasonType;
    }//如果不重写toString方法，那么直接打印返回当前枚举类对象常量的名称
}

interface info {
    void show();
}
enum Status implements info {
    GOOD(10, "free") {
        @Override
        public void show() {
            System.out.println("I am fine");
        }
    };
    private final int Salary;
    private final String state;
    private Status (int Salary, String state) {
        this.Salary = Salary;
        this.state = state;
    }
}

