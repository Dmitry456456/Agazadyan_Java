import java.util.Scanner;

public class More7 {
    public static void main(String[] args) {
        check();
    }
    public static void check(){
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n > 7) System.out.println("Привет");

    }
}
