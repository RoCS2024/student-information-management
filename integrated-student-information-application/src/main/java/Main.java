import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        String studentId = sc.nextLine();
        System.out.print("Enter Last Name: ");
        String lastName = sc.nextLine();
        System.out.print("Enter First Name: ");
        String firstName = sc.nextLine();
        System.out.print("Enter Middle Name: ");
        String middleName = sc.nextLine();
        System.out.print("Enter Sex (Male/Female): ");
        String sex = sc.nextLine();
        System.out.print("Enter Birthday (MM/DD/YYYY): ");
        String birthday = sc.nextLine();
        System.out.print("Enter Religion: ");
        String religion = sc.nextLine();
        System.out.print("Enter Email: ");
        String email = sc.nextLine();
        System.out.print("Enter Address: ");
        String address = sc.nextLine();
        System.out.print("Enter Contact Number: ");
        String contactNumber = sc.nextLine();
    }
}
