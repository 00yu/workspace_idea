/**
 * @author Yu Donghai
 * 测试StringBuilder、StringBuffer
 * @date 2020/11/6 15:23
 */
public class TestStringBuilder {
    //StringBuilder可变字符序列  字符数组没有final修饰
    public static void main(String[] args) {
        //StringBuilder线程不安全，效率高(一般使用)；StringBuffer线程安全，效率低
        //都是AbstractStringBuilder的子类
        StringBuilder sb=new StringBuilder("abodes");
        System.out.println(Integer.toHexString(sb.hashCode()));//打印sb的地址
        System.out.println(sb);//打印sb的内容
        sb.setCharAt(2,'M');//改变sb中内容
        System.out.println(Integer.toHexString(sb.hashCode()));//打印sb的地址
        System.out.println(sb);//打印sb的内容
    }
}
