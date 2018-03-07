package Animal;

public class Robot{
    private String name;
    private String model;
    private int num;
    private static int count = 0;

    public Robot(String n, String m){
        name = n;
        model = m;
        num = count++;
    }

    public String identify(){
        String id = name + " " + model + " " + String.valueOf(num);
        return id;
    }


}
