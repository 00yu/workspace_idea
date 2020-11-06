/**
 * @author Yu Donghai
 * 测试二维数组
 * @date 2020/11/6 13:47
 */
public class Test2DimensionArray {
    public static void main(String[] args) {
        //int[] a = new int[3];数组中存放整形数
        //Car[] cars=new Car[3];数组中存放new的Car对象地址
        int[][] a = new int[3][];//二维数组，数组中存放的是new的数组对象(长度不一定)地址
        a[0] = new int[]{20, 30};
        a[1] = new int[]{10, 15, 80};
        a[2] = new int[]{50, 60};
        System.out.println(a[1][2]);//a[1]通过a[1]数组地址找到a[1]数组再通过[2]找到80

    }
}

class Car {

}
