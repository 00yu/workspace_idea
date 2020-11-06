import java.util.Arrays;

/**
 * @author Yu Donghai
 * 测试java.util.Arrays工具类
 * @date 2020/11/6 11:26
 */
public class TestArrays {
    public static void main(String[] args) {
        int[] a={10,20,30};
        System.out.println(Arrays.toString(a));//[10, 20, 30]
        int[] b={100,20,30,5,70,80,200};
        //快排，升序排列
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));//[5, 20, 30, 70, 80, 100, 200]
        //二分查找数组中元素，查到则返回索引，未查到则返回-1
        System.out.println(Arrays.binarySearch(a,30));
    }
}
