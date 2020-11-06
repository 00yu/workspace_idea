/**
 * @author Yu Donghai
 * 测试可变字符序列和不可变字符序列使用的陷阱
 * @date 2020/11/6 15:44
 */
public class TestStringBuilder3 {
    public static void main(String[] args) {
        //使用String进行字符串的拼接(会造成程序崩溃)
        String str = "";
        long num1 = Runtime.getRuntime().freeMemory();//获取系统剩余内存空间
        long time1 = System.currentTimeMillis();//获取系统的当前时间
        for (int i = 0; i < 5000; i++) {
            str = str + i;//相当于产生了10000个对象(5000个i和5000个拼接后对象)
        }
        System.out.println(str);
        long num2 = Runtime.getRuntime().freeMemory();
        long time2 = System.currentTimeMillis();
        System.out.println("String占用内存 : " + (num1 - num2));
        System.out.println("String占用时间 : " + (time2 - time1));

        //替换(StringBuilder)
        StringBuilder sb=new StringBuilder("");
        long num3 = Runtime.getRuntime().freeMemory();
        long time3 = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            sb.append(i);
        }
        System.out.println(sb);
        long num4 = Runtime.getRuntime().freeMemory();
        long time4 = System.currentTimeMillis();
        System.out.println("StringBuilder占用内存 : " + (num3 - num4));
        System.out.println("StringBuilder占用时间 : " + (time4 - time3));
    }
}
