import java.util.Date;

/**
 * @author Yu Donghai
 * 测试Date类的常见用法
 * @date 2020/11/6 15:57
 */
public class TestDate {
    public static void main(String[] args) {
        /*public Date() {
            this(System.currentTimeMillis());
        }*/
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());//获取毫秒数
        //以后遇到日期处理使用Canlendar日期类(Date方法都被替代)
    }
}
