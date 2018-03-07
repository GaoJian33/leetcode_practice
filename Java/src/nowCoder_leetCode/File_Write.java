
import java.io.*;

//

public class File_Write {
    public static void main(String[] args) {
        try {
            FileOutputStream fop = new FileOutputStream(new File("classes/name.txt"));
            String name = "Gaojian";
            byte[] nameByte = name.getBytes();
            fop.write(nameByte);//输入的内容必须以字节形式输入
        } catch (Exception e) {
        return;
        }
    }
}