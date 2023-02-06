package objectoverring;

public class Point1 {
    private int x ,y;

    public Point1(int z, int k) {
        x=z;
        y=k;


    }
    public boolean equals(Point1 other){
        if(other==null){
            return false;
        }
        if(x==other.x && y==other.y){
            return true;

        }
        return false;
    }

    public static void main(String[] args) {
        Point1 p1 =new Point1(10,12);
        Point1 p2 = new Point1(50, 100);
        Point1 p3 = new Point1(10, 20);
        System.out.println("p1 equals p2 is " + p1.equals(p2));
        System.out.println("p1 equals p3 is " + p1.equals(p3));
    }
}
