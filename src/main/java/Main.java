import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] mass = new int[20];
        for (int i = 0; i < 20; i++) {
            mass[i] = getRand();
        }
        printMass(mass);
        int min = 0;
        int max = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > mass[max]) {
                max = i;
            }
            if (mass[i] < mass[min]) {
                min = i;
            }
        }
        if (mass[min] >= 0 || mass[max] <= 0) {
            System.out.println("Сгенерированный массив не удовлетворяет условиям");
        } else {
            for (int i = 0; i < mass.length; i++) {
                if (mass[max] > mass[i] && mass[i] > 0) {
                    max = i;
                }
                if (mass[min] < mass[i] && mass[i] < 0) {
                    min = i;
                }
            }
            System.out.println("\nМаксимальное отрицательное число в массиве: " + mass[min] + "\nМинимальное положительное числов массиве: " + mass[max]);
            int temp = mass[min];
            mass[min] = mass[max];
            mass[max] = temp;
            printMass(mass);
        }
    }

    public static int getRand() {
        return 10 - new Random().nextInt(21);
    }

    public static void printMass(int[] mass) {
        System.out.println("\nЭлементы массива:");
        for (int a : mass) {
            System.out.print(a + "; ");
        }
        System.out.println();
    }
}
