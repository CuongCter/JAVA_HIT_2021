package Bai4;

public class RunMain {
    public static void main(String[] args) {
        Sum <Integer> a = new Sum<Integer>(1, 2);
        System.out.println("Tong 2 so int : " + (a.getSoB()+a.getSoA()));


        Sum <Long> b = new Sum<Long>(15203l, 145203l);
        System.out.println("Tong 2 so long: "+ (b.getSoA() +b.getSoB()));
        Sum <Float> c = new Sum<Float>(2.2f, 3.14f);
        System.out.println("Tong 2 so float : "+ (c.getSoB() +c.getSoA()));
        Sum <Double> d = new Sum<>(3245.64, 2145.2);
        System.out.println("Tong 2 so double: " + (d.getSoA() +d.getSoB()));
    }
}
