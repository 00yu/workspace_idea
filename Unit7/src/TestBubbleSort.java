import java.util.Arrays;

/**
 * @author Yu Donghai
 * 测试冒泡排序及优化
 * @date 2020/11/6 14:06
 */
public class TestBubbleSort {
    public static void main(String[] args) {
        int[] values = {3, 1, 6, 2, 9, 0, 7, 4, 5, 8};
        int temp=0;
        for(int i=0;i<values.length-1;i++){
            //设置flag判断，若不发生交换则结束循环
            boolean flag=true;
            for(int j=0;j<values.length-1-i;j++){
                //比较大小，换顺序
                if(values[j]>values[j+1]) {
                    temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                    flag=false;
                }
            }
            if (flag){
                break;
            }
        }
        System.out.println(Arrays.toString(values));
    }
}
