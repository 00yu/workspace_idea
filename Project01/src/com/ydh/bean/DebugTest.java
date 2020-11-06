package com.ydh.bean;

import java.util.HashMap;

/**
 * @author Yu Donghai
 * @date 2020/10/30 13:01
 * debug测试 ctrl+u查看断点处变量内容 如查看map
 */
public class DebugTest {
    public static void main(String[] args) {
        //测试条件断点 i==60
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }

        HashMap<String, String> map = new HashMap<>();
        map.put("name","Tom");
        map.put("age","12");
        map.put("school","清华");
        map.put("major","computer");

        String age = map.get("age");
        System.out.println("age = " + age);
        map.remove("key");
        System.out.println(map);

    }
}
