/**
 * @author Yu Donghai
 * 测试泛型
 * @date 2020/11/6 21:58
 */
public class TestGeneric {
    public static void main(String[] args) {
        MyCollection<String> mc=new MyCollection<String>();
        mc.set("你好",0);
        //加入泛型String，编译器报错(int类型不是String类型)
        //mc.set(8888,1);
        //Integer a= (Integer) mc.get(1);
        String b=(String)mc.get(0);
    }
}
class MyCollection<E>{
    Object[] objs=new Object[5];
    public void set(E obj,int index){
        objs[index]=obj;
    }
    public E get(int index){
        return (E) objs[index];
    }
}
