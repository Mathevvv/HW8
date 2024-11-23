import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        //todo код программы писать тут
        int[] arr = new int[10];
        int av = 0, counter = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 40+ (int) (Math.random() * 60);
            System.out.println(arr[i]);
            av+=arr[i];
            if (arr[i]>=60 && arr[i]<=80) counter++;
        }

        System.out.println();
        System.out.println(counter);
        System.out.println((int)(av/arr.length));
    }
}
