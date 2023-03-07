import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập vào USD: ");
        int USD=scanner.nextInt();
        System.out.println("VND:"+USD*23000);
    }
}