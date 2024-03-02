import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        task1(arr);
        task2(arr);
        task3(arr);
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1(int[] arr) {
        int paySum = 0;
        for (int i=0; i < arr.length; i++) {
            paySum += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + paySum + " рублей.");
    }

    public static void task2(int[] arr) {
        if (arr.length == 0) {
            return;
        }
        int minPay = arr[0];
        int maxPay = arr[0];
        for (int i=1; i < arr.length; i++) {
            if (arr[i] < minPay) {
                minPay = arr[i];
            }
            if (arr[i] > maxPay) {
                maxPay = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minPay + " рублей.");
        System.out.println("Макимальная сумма трат за день составила " + maxPay + " рублей.");
    }

    public static void task3(int[] arr) {
        int paySum = 0;
        for (int i=0; i < arr.length; i++) {
            paySum += arr[i];
        }
        double avgSum = ((double) paySum)/arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + avgSum + " рублей.");
    }

    public static void task4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i=reverseFullName.length-1; i > -1; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}