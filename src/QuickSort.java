public class QuickSort {
    static private int compare = 0;
    static private int changes = 0;

    static void quickSort(int[] array, int left, int right) {
        if (array.length == 0)
            return;//завершить выполнение если длина массива равна 0

        if (left >= right)
            return;//завершить выполнение если уже нечего делить
        int i = left, j = right;//установка границ
        // выбрать опорный элемент
        int middle = left + (right - left) / 2;
        int opora = array[middle];

        // разделить на подмассивы, который больше и меньше опорного элемента

        while (i <= j) {
            while (array[i] < opora) {
                i++;
                changes++;
            }

            while (array[j] > opora) {
                j--;
                changes++;
            }

            if (i <= j) {//меняем местами
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
                compare++;
            }
        }
        // вызов рекурсии для сортировки левой и правой части
        if (left < j) {
            quickSort(array, left, j);
        }
        if (i < right) {
            quickSort(array, i, right);
        }

    }


    static void print(int[] array) {
        System.out.println("--- Массив ПОСЛЕ Быстрой сортировки ---");
        System.out.println("");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("\n Сравнений: " + compare + " ; Замен: " + changes);
        compare = changes = 0;
    }
}
