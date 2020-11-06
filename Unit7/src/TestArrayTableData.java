import java.util.Arrays;

/**
 * @author Yu Donghai
 * 测试数组存储表格数据
 * @date 2020/11/6 13:58
 */
public class TestArrayTableData {
    public static void main(String[] args) {
        //自动装箱(编译器自动转化Object类)
        Object[] a1 = {1001,"高淇",18,"讲师","2006-2-14"};
        Object[] a2 = {1002,"高小七",19,"助教","2007-10-10"};
        Object[] a3 = {1003,"高小琴",20,"班主任","2008-5-5"};
        Object[][] tableData=new Object[3][];
        tableData[0]=a1;
        tableData[1]=a2;
        tableData[2]=a3;
        for (Object[] temp :
                tableData) {
            System.out.println(Arrays.toString(temp));
        }
    }
}
