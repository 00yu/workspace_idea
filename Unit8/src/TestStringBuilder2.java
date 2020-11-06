/**
 * @author Yu Donghai
 * StringBuilder中常用方法(除了String中的方法)
 * @date 2020/11/6 15:33
 */
public class TestStringBuilder2 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        for (int i=0;i<26;i++){
            sb.append((char)('a'+i));
        }
        System.out.println(sb);
        //倒序
        sb.reverse();
        System.out.println(sb);
        //修改
        sb.setCharAt(3,'余');
        System.out.println(sb);
        //插入
        //核心就是该方法调用了return this,把自身返回，因此可以链式调用
        sb.insert(0,'我').insert(6,'爱').insert(8,'你');
        System.out.println(sb);
        //删除
        //也可链式调用(删除一个区间)
        sb.delete(20,23);
        System.out.println(sb);
    }
}
