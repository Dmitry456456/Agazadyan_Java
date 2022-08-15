import java.util.Scanner;

public class Name {

    public static void main(String[] args) {
        check();
    }
    public static void check(){
        String name1 = "Вячеслав";
        System.out.println("Введите имя");
        Scanner scanner = new Scanner(System.in);
        String name2 = scanner.nextLine();
        if (name2.equals(name1)) System.out.println("Привет, "+name1);
        else System.out.println("Нет такого имени");

    }
}
