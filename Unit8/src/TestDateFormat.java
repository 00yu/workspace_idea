import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Yu Donghai
 * 测试时间对象和字符串之间的相互转化
 * DateFormat抽象类和SimpleDateFormat实现类的使用
 * @date 2020/11/6 16:06
 */
public class TestDateFormat {
    public static void main(String[] args) throws ParseException {
        //把时间对象按照指定的格式转成相应的字符串
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String str=df.format(new Date());
        System.out.println(str);
        //把字符串按照指定的格式转成相应的时间对象
        DateFormat df2=new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒");
        Date date=df2.parse("1983年5月13日 10时45分50秒");
        System.out.println(date);
        //测试其他的格式字符 D本时间是所处年份的第几天
        DateFormat df3=new SimpleDateFormat("D");//今天是今年的第多少天
        String str3=df3.format(new Date());
        System.out.println(str3);

    }
}
