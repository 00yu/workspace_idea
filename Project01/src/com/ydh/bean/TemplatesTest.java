package com.ydh.bean;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Yu Donghai
 * @date 2020/10/30 9:59
 * <p>
 * IDEA中代码模块所处的位置   setting-Editor-live Templates/Postfix Completion
 * 模板用tab键进行补全
 */
public class TemplatesTest {
    //模板6：prsf：可生成 private static final
    private static final int I = 1;
    //变形：psf
    public static final int NUM = 1;
    //变形：psfi
    public static final int NUM2 = 1;
    //变形：psfs
    public static final String NATION="CHINA";


    //模板1：psvm或main
    public static void main(String[] args) {
        //模板2：sout
        System.out.println("hello");
        //变形：soutp(打印形参)/soutm(打印方法)/soutv(打印变量)/xxx.sout
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("TemplatesTest.main");
        int i = 1;
        System.out.println("i = " + i);
        //模板3：fori
        String[] arr = new String[]{"Tom", "Jerry", "Lilei"};
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
        //变形：iter
        for (String s : arr) {
            System.out.println(s);
        }
        //变形：itar
        for (int j = 0; j < arr.length; j++) {
            String s = arr[j];
            System.out.println(s);
        }
        //模板4：list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);
        for (Object o : list) {

        }
        //变形：list.fori 正序遍历
        for (int i1 = 0; i1 < list.size(); i1++) {

        }
        //变形：list.forr 倒序遍历
        for (int i1 = list.size() - 1; i1 >= 0; i1--) {

        }
    }

    public void method() {
        System.out.println("TemplatesTest.method");
        //模板5：ifn(if null)
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);
        if (list == null) {

        }
        //变形：inn(if not null)
        if (list != null) {

        }
        //变形：xxx.nn/xxx.null
        if (list != null) {

        }
        if (list == null) {

        }
    }
}
