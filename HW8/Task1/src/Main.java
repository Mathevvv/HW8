public class Main {
    public static void main(String[] args) {
        //#1 Создать массив из 10 целых чисел. Значения могут быть любыми
        //todo
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i*i;
        }
        System.out.println();
        System.out.println();//#2 Распечатать все значения массива начиная с 0 до последнего индексов.
        //todo
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
        System.out.println();
        //#3 Распечатать все значения массива с конца (начиная с последнего до 0 индексов).
        //todo
        for (int i = arr.length-1; i>=0; i--) {
            System.out.println(arr[i]);
        }
        System.out.println();
        System.out.println();
        //#4 *** Задание особой сложности. Развернуть массив(см конец урока).
        //todo
        for (int i = 0; i < 5; i++) {
            int buf = arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=buf;

        }
        System.out.println();
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
