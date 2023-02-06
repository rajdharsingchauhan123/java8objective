package canvas;

import accessmodifier.Circle;

public class Canvas {

    void  getArea(){
        Circle circle =new Circle();
        circle.area();// call to public method area() outSide the package


    }

    public static void main(String[] args) {

        Canvas c =new Canvas();
        c.getArea();

    }
}
