public class Array {
    int size = 100;
    int[] array = new int [size];
    int[] ar1 = null;
    public void arr(int num ) {
        num = size;
        for (int i = 0; i <= num - 1; i++) {
            array[i] = (int) (Math.random() * 100);
        }

    }
    public int[] getAr1() {
        ar1 = array.clone();
        return ar1;
    }
    public int[] getArray() {
        return array;
    }
    public void printArr(){
        System.out.print("Исходный массив:  ");
        for (int i: array)

            System.out.print(i + " " );
    }
}
