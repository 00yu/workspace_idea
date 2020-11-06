

/**
 * @author Yu Donghai
 * 测试非静态内部类
 * @date 2020/11/6 9:41
 */
public class TestInnerClass {
    public static void main(String[] args) {
        //创建非静态内部类对象(内部类对象依托于外部类对象，因此需要先new出来外部类对象)
        Outer.Inner inner=new Outer().new Inner();
        inner.show();
    }
}

class Outer {//生成class文件Outer.class
    private int age = 10;
    public void testOuter(){
        System.out.println("Outer.testOuter()");
    }
    //成员内部类中的非静态内部类(可以直接访问外部类的成员，只为外部类服务，但外部类不能访问内部类的成员)
    class Inner{//生成class文件Outer$Inner.class
        int age=20;
        public void show(){
            System.out.println("外部类的成员变量age："+Outer.this.age);
            System.out.println("内部类的成员变量age："+this.age);
        }
    }
}

