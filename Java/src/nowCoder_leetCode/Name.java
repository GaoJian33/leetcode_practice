import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.zip.InflaterInputStream;

//创建类时对类的理解，static

public class Name {
    public static void main(String[] args) throws FileNotFoundException {
        Name writer = new Name("gao","jian");
        writer.setTitle("Coder");
        writer.printName();
    }

    public static Name read(BufferedReader br){


    }


    public Name (String first, String last){
        firstName = first;
        lastName = last;
        title = "";
    }

    public String getInitials(){
        return firstName.substring(0,1);
    }

    public String getLastFirst(){
        return lastName + "," + firstName;
    }

    public void setTitle(String newTitle){
        title = newTitle;
    }

    public void printName(){
        System.out.println(getInitials());
        System.out.println(getLastFirst());
        System.out.println(title+" "+getInitials());
    }

    private String firstName;
    private String lastName;
    private String title;
    //static 修饰的变量 或者 method 可以使用类名去访问
    //而没有static的变量只能通过 对象 进行访问

}
