
import java.io.*;
import java.util.Scanner;

public class File_Read {
    public static void main(String[] args) throws IOException {
        File file = new File("File_Write.java");//构建文件对象
        Scanner scanner = new Scanner(file);// The initialness of Scanner() can be file, path and fos;
        File copy = new File("copy.txt");
        Writer writer = new FileWriter(copy); //Writer是一个抽象类，在初始化的时候要具体指定对象的种类
        while(scanner.hasNextLine()){
            String str = scanner.nextLine();
            System.out.println(str);
            writer.write(str);
            writer.write("\n");
        }
        writer.close();
    }
}
