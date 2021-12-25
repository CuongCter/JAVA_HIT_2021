package Bai1;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Pattern;

public class RunMain {
    static Scanner scanner = new Scanner(System.in);
    static List<Account> accountList = new ArrayList<>();
    static Pattern pattern;
    static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    static Controller fileController = new Controller();

    static final String regUserName = "^[a-zA-Z0-9]{6,}$";
    static final String regPassWord = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*?&])[A-Za-z0-9@$!%*?&]{8,}$";
    static final String regPhoneNumber = "^[0-9\\-\\+]{9,15}$";
    static final String regEmail = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";

    public static void main(String[] args) {
        int choose;
        do {
            System.out.println("\nYour options: ");
            System.out.println("1. Creat new account");
            System.out.println("2. Login to an existing account.");
            System.out.println("3. Sort accounts by username.");
            System.out.println("4. Exit");
            System.out.print("Your choose: ");
            choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    creatAccount();
                    break;
                case 2:
                    Login();
                    break;
                case 3:

                    sortAccoutByUsername();
                    break;
                case 4:
                    System.out.println("Goodbye!!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Your choose id invalid");
            }
        } while (true);
    }

    private static void sortAccoutByUsername() {
    }

    private static void Login() {
    }

    private static void creatAccount() {
    }


}