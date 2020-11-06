
/**
 * @author Yu Donghai
 * 字符串测试
 * @date 2020/11/6 10:18
 */
public class TestString {
    public static void main(String[] args) {
        // private final char value[];(String源码)  不可变字符序列(final修饰只能初始化一次)
        String str = "abc";
        String str2 = new String("def");
        String str3 = "abc" + "def";
        String str4 = "16" + 17;//不是加法了，而是字符串连接
        System.out.println(str4);//1617

        String  str10="ydh";//常量池
        String  str11="ydh";//常量池
        String str12=new String("ydh");//新建对象 与str10和str11不是同一对象
        System.out.println(str10==str11);//true
        System.out.println(str12==str11);//false
        //通常比较字符串时，使用equals
        System.out.println(str12.equals(str11));//alt+enter自动补全
    }
}
