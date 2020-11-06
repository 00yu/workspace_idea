import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * @author Yu Donghai
 * @date 2020/11/6 20:34
 */
public class TestFile {
    public static void main(String[] args) throws IOException {
        //File f=new File("d:/a.txt");  用\的话由于\是转义字符，因此需要写\\
        File f = new File("d:\\a.txt");
        System.out.println(f);//打印文件路径
        f.renameTo(new File("d:/bb.txt"));//重命名文件
        System.out.println(System.getProperty("user.dir"));//项目路径
        File f2 = new File("gg.txt");//默认当前项目下
        f2.createNewFile();//创建新的文件
        System.out.println("File是否存在："+f2.exists());
        System.out.println("File是否是目录："+f2.isDirectory());
        System.out.println("File是否是文件："+f2.isFile());
        System.out.println("File最后修改时间："+new Date(f2.lastModified()));
        System.out.println("File的大小："+f2.length());
        System.out.println("File的文件名："+f2.getName());
        System.out.println("File的目录路径："+f2.getPath());
        System.out.println("File的目录绝对路径："+f2.getAbsolutePath());
        f2.delete();//删除文件

        File f3=new File("d:/电影/华语/大陆");
        //boolean flag=f3.mkdir();//目录结构中有一个不存在，则不会创建该目录
        //System.out.println(flag);//false 创建失败
        boolean flag=f3.mkdirs();//创建整个目录树
        System.out.println(flag);//true 创建成功
    }
}
