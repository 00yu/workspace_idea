import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Yu Donghai
 * @date 2020/11/6 21:23
 */
public class TestTryCatchFinally {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new FileReader("d:/bb.txt");
            char c1 = (char) reader.read();
            System.out.println(c1);//h
        } catch (FileNotFoundException e) {//子类异常在父类异常前面
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
