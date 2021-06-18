import java.util.Arrays;
import java.util.Scanner;

public class Menu {
    Scanner scan = new Scanner(System.in);
    String s = "";
    int x = 0;
    String name;

    public void menu1() {
        Array array = new Array();
        array.arr(10);
        while (!"3".equals(s)) {
            System.out.println("\n Действия \n");
            System.out.println("1. Вывод исходного массива");
            System.out.println("2. Быстрая сортировка");
            System.out.println("3. Выход");
            s = scan.next();
            try {
                x = Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод");
            }
            switch (x) {
                case 1:
                    array.printArr();
                    break;
                case 2:

                    QuickSort.quickSort(array.getAr1(), 0, array.size - 1);
                    QuickSort.print(array.ar1);
                    break;
            }
        }
    }
}