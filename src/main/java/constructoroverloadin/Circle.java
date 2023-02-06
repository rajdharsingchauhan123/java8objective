package constructoroverloadin;

public class Circle {
    private int xpos;
    private int ypos;
    private int raduis;

    public Circle(int xpos, int ypos, int raduis) {
        this.xpos = xpos;
        this.ypos = ypos;
        this.raduis = raduis;
    }

    public Circle(int xpos, int ypos) {
        this.xpos = xpos;
        this.ypos = ypos;

    }

    public Circle() {
    }

    @Override
    public String toString() {
        return "Circle{" +
                "xpos=" + xpos +
                ", ypos=" + ypos +
                ", raduis=" + raduis +
                '}';
    }

    public static void main(String[] args) {
        Circle c =new Circle();
        System.out.println(new Circle());
        System.out.println(new Circle(12,15,53));
        System.out.println(new Circle(23,23));

    }
}
