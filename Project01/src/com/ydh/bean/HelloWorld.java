package com.ydh.bean;
/**
 * 快捷键的使用：
 * 1.执行 alt+r
 * 2.提示补全 alt+/
 * 3.单行注释 ctrl+/
 * 4.多行注释 ctrl+shift+/
 * 5.向下复制一行 ctrl+alt+down
 * 6.删除一行或选中行 ctrl+d
 * 7.向下移动一行 alt+down
 * 8.向上移动一行 alt+up
 * 9.向下开始新的一行   shift+enter
 * 10.向上开始新的一行  ctrl+shift+enter
 * 11.查看源码  ctrl+选中指定的结构
 * 12.万能解错/生成返回值变量  alt+enter(补全变量类型和变量名)
 * 13.退回到前一个编辑的界面   alt+left(查看源码来回切换)
 * 14.进入到下一个编辑的界面   alt+right
 * 15.查看继承关系    F4
 *
 * 16.格式化代码 ctrl+shift+f
 * 17.提示参数类型    ctrl+alt+/(提示输入形参类型)
 * 18.反撤销   ctrl+y
 * 19.选中数行，整体向后移动   tab
 * 20.选中数行，整体向前移动   shift+tab
 * 21.查看类的结构(outline)    alt+O
 * 22.重构：修改变量名与方法名(rename)  alt+shift+r
 * 23.大小写转换 ctrl+shift+y
 * 24.生成构造器/get/set/toString alt+shift+s
 * 25.收起所有的方法   alt+shift+c
 * 26.打开所有的方法   alt+shift+x
 * 27.打开硬盘中的位置  ctrl+shift+x
 * 28.生成try-catch,region(将不需要调的代码折叠方便纠错) alt+shift+z
 * 29.查找/替换(当前) ctrl+F
 * 30.查找(全局)    ctrl+H
 * 31.查看类的继承结构图 ctrl+shift+u
 * 32.添加到收藏 ctrl+alt+f
 * 33.打开最近修改的文件 ctrl+E
 * 34.快速搜索类中的错误位置   ctrl+shift+q
 * 35.选择要粘贴的内容  ctrl+shift+v
 * 36.查找方法在哪里被调用    ctrl+shift+h
 */

import java.util.ArrayList;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("hello");
        ArrayList list = new ArrayList();
        int a = 1;
        if (a > 0) {
            for (; a < 10; ) {
                a++;
            }
        }
    }

    public void method() {
    }
}
