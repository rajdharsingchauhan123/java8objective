package accessmodifier;

public class Circles {
    void getArea(){
        Circle circle =new Circle();
        // call to public method area() within package;
        circle.area();
        // calling the fillColour() with default access within package
        circle.fillColour();
    }
}
