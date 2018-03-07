import java.net.*;
import java.io.*;

class WHWWW{
    public static void main(String[] args) {
        try {
            URL u = new URL("http://www.runoob.com/manual/jdk1.6/");
            InputStream ins = u.openStream();
            InputStreamReader isr = new InputStreamReader(ins);
            BufferedReader whiteHouse = new BufferedReader(isr);

            System.out.println(whiteHouse.readLine());
            System.out.println(whiteHouse.readLine());
            System.out.println(whiteHouse.readLine());
            System.out.println(whiteHouse.readLine());
            System.out.println(whiteHouse.readLine());

            File file = new File("practice.htlm");
            FileOutputStream fos = new FileOutputStream("file");

        }catch (Exception e){
            System.out.println("aloha!");
        }
    }
}