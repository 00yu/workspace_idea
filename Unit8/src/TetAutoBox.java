/**
 * @author Yu Donghai
 * 测试自动装箱、自动拆箱
 * @date 2020/11/6 14:52
 */
public class TetAutoBox {
    public static void main(String[] args) {
        //自动装箱
        Integer a = 234;//编译器自动转成Integer a=Integer.valueOf(234);
        //自动拆箱
        int b = a;//编译器自动转成int b=a.intValue();

        Integer c=null;
        if(c!=null){
           int d=c;//int d=c.intValue()而c为空，所以会报空指针异常
        }

        //[-128,127]之间的数字。实际就是系统初始的时候，创建了[-128,127]之间的一个数组
        //当我们调用valueOf()的时候(或者编译器自动装箱调用)：首先检查是否在[-128,127]之间
        //如果在这个范围则直接从缓存数组中拿出已经建好的对象；如果不在这个范围则创建新的Integer对象
        /*public static Integer valueOf(int i) {
            if (i >= Integer.IntegerCache.low && i <= Integer.IntegerCache.high)
                return Integer.IntegerCache.cache[i + (-Integer.IntegerCache.low)];
            return new Integer(i);
        }*/
        Integer in1 = -128;
        Integer in2 = -128;
        System.out.println(in1 == in2);//true 因为-128在缓存范围内，因此指向的是同一个对象
        System.out.println(in1.equals(in2));//true
        Integer in3 = 1234;
        Integer in4 = 1234;
        System.out.println(in3 == in4);//false 因为1234不在缓存范围内
        System.out.println(in3.equals(in4));//true
    }
}
