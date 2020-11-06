/**
 * @author Yu Donghai
 * @date 2020/11/6 15:09
 */
public class TestString {
    //String:不可变字符序列 private final char value[];若想改变只能重新创建新字符串
    public static void main(String[] args) {
        String st = "arcana";
        String st1 = st.substring(2, 4);//st1是另一个字符串常量，st常量值未改变
        System.out.println(st == st1);
        System.out.println(st);

        //编译器做了优化,直接在编译的时候将字符串进行拼接
        String str1 = "hello" + " java";//相当于str1 = "hello java";
        String str2 = "hello java";
        System.out.println(str1 == str2);//true
        String str3 = "hello";
        String str4 = " java";
        //编译的时候不知道变量中存储的是什么,所以没办法在编译的时候优化
        String str5 = str3 + str4;
        System.out.println(str2 == str5);//false

        //字符串比较用equals方法，不要使用==
    }
}
