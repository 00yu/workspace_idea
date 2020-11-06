/**
 * @author Yu Donghai
 * 测试包装类-将基本数据类型包装成对象
 * @date 2020/11/6 14:39
 */
public class TestWarppedClass {
    public static void main(String[] args) {
        //基本数据类型转成包装类对象
        Integer a = new Integer(3);
        Integer b = Integer.valueOf(30);
        //包装类对象转成基本数据类型
        int c = b.intValue();//Number类方法
        double d = b.doubleValue();
        //字符串转换成包装类对象
        Integer e=new Integer("999");//内部方法和下一个一样
        Integer f=Integer.parseInt("99999");
        //把包装类转化为字符串
        String  str=f.toString();//或者""+f
        //常见的常量
        System.out.println("int类型最大的整数："+Integer.MAX_VALUE);
    }
}
