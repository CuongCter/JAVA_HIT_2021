package Bai2;
import java.util.Scanner;
import java.util.ArrayList;
public class RunMain {
    static Scanner sc = new Scanner(System.in);
    static ArrayList <Book> book = new  ArrayList <> ();
    public static void main(String[] args) {



    public static void showMenu() {
        System.out.println("-----------menu------------");
        System.out.println("1. Add book.");
        System.out.println("2. Edit book by id.");
        System.out.println("3. Delete book by id.");
        System.out.println("4. Sort book by name.");
        System.out.println("5. Sort book by price.");
        System.out.println("6. Show all books.");
        System.out.println("0. exit.");
        System.out.println("---------------------------");
        System.out.print("Chọn: ");
    }

    public static void Add() {
        Book a = new Book ();
        System.out.print("Nhâp ID          : "); a.setId(sc.nextLine());
        System.out.print("Nhâp tên sách    : "); a.setName(sc.nextLine());
        System.out.print("Nhâp nhà xuất bản: "); a.setPublisher(sc.nextLine());
        System.out.print("Nhâp giá         : "); a.setPrice(sc.nextFloat());
        System.out.print("Nhâp số trang    : "); a.setNumberOfPage(sc.nextInt());
        sc.nextLine();
        System.out.print("Nhâp tác giả     : "); a.setAuthor(sc.nextLine());
        book.add(a);
    }

}
