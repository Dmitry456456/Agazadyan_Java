import java.util.Scanner;

public class Arr3 {
    public static void main(String[] args) {
        check();
    }
    public static void check(){
        System.out.println("Введите количество элементов массива");
        Scanner scanner = new Scanner(System.in);
        int k=0;
        int n= scanner.nextInt();
        int[] a = new int[n];
        System.out.println("Введите значения элементов массива");
        Scanner scanner1 = new Scanner(System.in);
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = scanner1.nextInt();
        }
        System.out.println("Кратны 3:");
        for (int i = 0; i <= a.length - 1; i++) {
            if (a[i] % 3 == 0 & a[i] != 0) {
                System.out.print(a[i]+" ");
                k++;
            }

        }
        if (k == 0) System.out.println("Нет кратных чисел");

    }
}
