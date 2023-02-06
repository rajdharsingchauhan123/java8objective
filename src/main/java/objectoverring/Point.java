package objectoverring;

public class Point {
    private int xpos,ypos;


    public Point(int x, int y){
        xpos =x;
        ypos=y;


        }
    @Override
    public String toString() {
        return "Point{" +
                "xpos=" + xpos +
                ", ypos=" + ypos +
                '}';

//
    }

    public static void main(String[] args) {
       // System.out.println(new Point(10,29));
        Object o =new Point(23,34);
        System.out.println(o);
    }
}
