package Java.编程之美;

public class OneInByte {
    static short text = 0x11;
    public static void main(String[] args) {
        method1();
        text = 0x11;
        method2();
        text = 0x61;
        method3();//
    }

//高级位操作
    public  static void method3(){
        int count = 0;
        while(text != 0){
            System.out.println(Integer.toBinaryString(text));
            text &= (text - 1);
            count++;
        }
        System.out.println(count);
    }

// 利用位运算
    public static void method2() {
        int count = 0;
        while(text != 0){
            if((text & 0x01) != 0){
                count++;
            }
            text >>= 1;
        }
        System.out.println(count);
    }

// 利用除法余数
    static void method1(){
        int count = 0;
        while(text != 0){
            if(text % 2 == 1)count++;
            text /= 2;
        }
        System.out.println(count);
    }

}
