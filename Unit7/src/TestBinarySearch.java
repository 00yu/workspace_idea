import java.util.Arrays;

/**
 * @author Yu Donghai
 * 测试二分法查找(折半检索)
 * @date 2020/11/6 14:24
 */
public class TestBinarySearch {
    public static void main(String[] args) {
        int[] arr = {30, 20, 50, 10, 80, 9, 7, 12, 100, 40, 8};
        //注意：二分法查找前提数组需要排序
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(myBinarySearch(arr,40));
        System.out.println(myBinarySearch(arr,7));

    }

    public static int myBinarySearch(int[] arr,int value){
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if(value==arr[mid]){
                return mid;
            }
            if(value>arr[mid]){
                low=mid+1;
            }
            if(value<arr[mid]){
                high=mid-1;
            }
        }
        return -1;
    }
}
