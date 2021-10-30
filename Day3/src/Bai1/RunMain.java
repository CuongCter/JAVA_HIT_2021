package Bai1;

public class RunMain {
    public static void main(String[] args) {
        Person a = new Person("Cuong",19,"Nam","Game");
        System.out.println(a);
        Person b = new Person();
        b.setName("Bi");
        b.setAge(18);
        b.setGender("Nu");
        b.setHobby("MakeUp");
        System.out.println("Name: "+b.getName());
        System.out.println("Age: "+ b.getAge());
        System.out.println("Gender: "+b.getGender());
        System.out.println("Hobby: "+b.getHobby());
    }
}
