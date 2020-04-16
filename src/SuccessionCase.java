/**
 * Created with IntelliJ IDEA.
 *
 * @auther: oji
 * @since: 2020/04/16/9:36
 */
public class SuccessionCase {
    /**
     * 属性/变量不存在重写和覆盖
     * 批量化处理
     */
    public String name;
    public int age;

    public SuccessionCase() {
        name = "李明";
    }

    public void ShowAge() {
        age = 30;
        System.out.println(age);
    }

    public static class Subclass extends SuccessionCase {
        public String name;
        public int age;

        public Subclass() {
            name = "李杰";
        }

        @Override
        public void ShowAge() {
            age = 11;
            System.out.println(age);
        }
    }

    public static class Subclass1 extends SuccessionCase {
        public String name;
        public int age;

        public Subclass1() {
            name = "李杰";
        }

        @Override
        public void ShowAge() {
            age = 12;
            System.out.println(age);
        }
    }

    public static class Subclass2 extends SuccessionCase {
        public String name;
        public int age;

        public Subclass2() {
            name = "李杰";
        }

        @Override
        public void ShowAge() {
            age = 16;
            System.out.println(age);
        }
    }

    public static void main(String[] args) {
        SuccessionCase s = new Subclass();
        System.out.println(s.name);
        s.ShowAge();
        System.out.println("----------------------------->");

        SuccessionCase s1 = new Subclass1();
        System.out.println(s1.name);
        s1.ShowAge();
        System.out.println("----------------------------->");

        SuccessionCase s2 = new Subclass2();
        System.out.println(s2.name);
        s2.ShowAge();
        System.out.println("----------------------------->");

        System.out.println("https://blog.csdn.net/jay112011/article/details/80045120");
    }
}
