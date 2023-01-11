package homework5;

public class ArraySort {
    public static void main(String[] args) {
        int[] numbers = {25, -57, 31, 10, 83, 87, -48, 55};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int tmp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tmp;
                }
            }
            System.out.println(numbers[i]);
        }


        int[] num = {51, -31, 77, 30, 5, 62, 84};
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] < num[j]) {
                    int tmp = num[i];
                    num[i] = num[j];
                    num[j] = tmp;
                }
            }
            System.out.println(num[i]);

        }
    }
}