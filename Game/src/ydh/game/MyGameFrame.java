package ydh.game;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author Yu Donghai
 * 游戏窗口
 * @date 2020/11/5 20:32
 */
public class MyGameFrame extends Frame {

    //将背景图片与飞机图片定义为成员变量
    Image bgImg = GameUtil.getImage("images/bg.jpg");
    Image planeImg = GameUtil.getImage("images/plane.png");
    Plane plane = new Plane(planeImg, 300, 300, 3);
    //增加ArrayList存放炮弹对象
    ArrayList<Shell> shellList = new ArrayList<Shell>();
    Explode bao;//创建爆炸对象
    Date startTime = new Date();    //游戏起始时刻
    Date endTime;  //游戏结束时刻

    //paint方法作用是：画出整个窗口及内部内容。被系统自动调用。
    @Override
    public void paint(Graphics g) {
        //先画背景再画飞机以免被覆盖
        g.drawImage(bgImg, 0, 0, null);
        plane.drawMySelf(g);//画出飞机本身
        //画炮弹
        for (int i = 0; i < shellList.size(); i++) {
            Shell b = shellList.get(i);
            b.draw(g);

            //飞机和所有炮弹对象进行矩形检测
            boolean peng = b.getRect().intersects(plane.getRect());
            if (peng) {
                plane.live = false;   //飞机死掉,画面不显示
                if (bao == null) {
                    bao = new Explode(plane.x, plane.y);
                }
                bao.draw(g);
            }
        }

        if (!plane.live) {
            if (endTime == null) {
                endTime = new Date();
            }
            int period = (int) ((endTime.getTime() - startTime.getTime()) / 1000);
            printInfo(g, "时间：" + period + "秒", 50, 120, 260, Color.white);
        }
    }

    //定义重画窗口的线程内部类
    class PaintThread extends Thread {
        public void run() {
            while (true) {
                repaint();
                try {
                    Thread.sleep(40);//1s=1000ms
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void lauchFrame() {
        setTitle("飞机大战");
        //窗口默认不可见，设为可见
        setVisible(true);
        //设置窗口大小
        setSize(500, 500);
        //设置窗口位置
        setLocation(300, 300);
        addKeyListener(new KeyMonitor());//增加键盘的监听
        //初始化，生成一堆炮弹
        for (int i = 0; i < 50; i++) {
            Shell b = new Shell();
            shellList.add(b);
        }
        new PaintThread().start();//启动重画线程
        //匿名内部类 只在这里使用一次的类
        //增加关闭窗口监听(匿名内部类)  用户点击关闭图标，程序结束运行
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }

    //定义为内部类，可以方便的使用外部类的普通属性
    class KeyMonitor extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            plane.addDirection(e);
        }

        @Override
        public void keyReleased(KeyEvent e) {
            plane.minusDirection(e);
        }
    }

    /**
     * 在窗口上打印信息
     *
     * @param g
     * @param str
     * @param size
     */
    public void printInfo(Graphics g, String str, int size, int x, int y, Color color) {
        Color c = g.getColor();
        g.setColor(color);
        Font f = new Font("宋体", Font.BOLD, size);
        g.setFont(f);
        g.drawString(str, x, y);
        g.setColor(c);
    }

    public static void main(String[] args) {
        MyGameFrame f = new MyGameFrame();
        f.lauchFrame();
    }

    //添加双缓冲技术
    private Image offScreenImage = null;

    public void update(Graphics g) {
        if (offScreenImage == null)
            offScreenImage = this.createImage(500, 500);//这是游戏窗口的宽度和高度

        Graphics gOff = offScreenImage.getGraphics();
        paint(gOff);
        g.drawImage(offScreenImage, 0, 0, null);
    }
}
