/**
 * @author Yu Donghai
 * 测试数组的拷贝
 * @date 2020/11/6 10:57
 */
public class TestArrayCopy {
    public static void main(String[] args) {
        testBasicCopy();
        testBasicCopy2();
        String[] str = {"阿里", "京东", "百度", "小米"};
        removeElement(str, 1);
        str=extendRange(str);
    }

    //测试从一个数组拷贝元素到另一个数组
    public static void testBasicCopy() {
        String[] s1 = {"aa", "bb", "cc", "dd", "ee"};
        String[] s2 = new String[10];
        System.arraycopy(s1, 2, s2, 6, 3);
        for (int i = 0; i < s2.length; i++) {
            System.out.println(i + "--" + s2[i]);
        }
    }

    //测试从数组中删除某个元素cc(本质上还是数组的拷贝)
    public static void testBasicCopy2() {
        String[] s1 = {"aa", "bb", "cc", "dd", "ee"};
        //将索引为3,4的元素覆盖索引为2,3的元素
        System.arraycopy(s1, 3, s1, 2, 2);
        //将索引为4的元素置空
        s1[s1.length - 1] = null;
        for (int i = 0; i < s1.length; i++) {
            System.out.println(i + "--" + s1[i]);
        }
    }

    //将删除某个索引元素的方法封装
    public static String[] removeElement(String[] s, int index) {
        System.arraycopy(s, index + 1, s, index, s.length - index - 1);
        s[s.length - 1] = null;
        for (int i = 0; i < s.length; i++) {
            System.out.println(i + "--" + s[i]);
        }
        return s;
    }

    //数组的扩容(本质也是数组拷贝)先定义一个更大的数组并拷贝
    public static String[] extendRange(String[] s1) {
        String[] s2 = new String[s1.length + 10];
        System.arraycopy(s1, 0, s2, 0, s1.length);//将s1中所有元素拷贝到s2
        for (String temp : s2) {
            System.out.println(temp);
        }
        return s2;
    }
}
