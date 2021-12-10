package Bai2;

public class RunMain {
    public static void main(String[] args) {
        IShape[] shapes = new IShape[4];
        shapes[0] = new Rectangle(3.2,4.3);
        shapes[1] = new Rectangle(6.2,5.5);
        shapes[2] = new Circle(2.2);
        shapes[3] = new Circle(7.6);
        for( int i =0 ; i< 4; i++){
            System.out.println("Area of shapes["+i+"] = "+ shapes[i].getArea());
            System.out.println("Perimeter of shapes["+i+"] = "+ shapes[i].getPerimeter());
        }
    }
}
