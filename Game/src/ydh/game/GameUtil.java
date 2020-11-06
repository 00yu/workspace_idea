package ydh.game;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

/**
 * @author Yu Donghai
 * 工具类
 * @date 2020/11/5 20:37
 */
public class GameUtil {
    //工具类最好将构造器私有化
    private GameUtil() {

    }

    //获取图片
    public static Image getImage(String path) {
        BufferedImage bi = null;
        try {
            URL u = GameUtil.class.getClassLoader().getResource(path);//获取类加载器
            bi = ImageIO.read(u);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bi;
    }
}
