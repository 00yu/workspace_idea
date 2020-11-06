/**
 * @author Yu Donghai
 * 测试匿名内部类
 * new  父类构造器(实参类表) \实现接口 () {
 *            //匿名内部类类体！
 * }
 * @date 2020/11/6 10:01
 */
public class TestAnonymousInnerClass {
    public static void test01(AA a){
        System.out.println("111");
       a.aa();
    }

    public static void main(String[] args) {
        //匿名内部类实现接口
        TestAnonymousInnerClass.test01(new AA() {
            @Override
            public void aa() {
                System.out.println("222");
            }
        });
    }
}

interface AA{
    void aa();
}
