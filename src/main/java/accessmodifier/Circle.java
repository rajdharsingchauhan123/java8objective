package accessmodifier;

public class Circle extends Shape{
    private int radius=12;

    public  void area(){
        System.out.println("area" + 3.14*radius*radius);

    }
    void fillColour(){
        // acces the protected field in subclass
        System.out.println("colour"+ colour);
    }
}
