public class Main {
    public static final double GRAMS_IN_POUND = 453.6;

    public static void main(String[] args) {
        task1(2, 3);
        task2(123);
        task3(244.6);
        task4(10000, 7, 0.13);
    }

    public static void task1(int a, int b) {
        a += b;
        b = a - b;
        a -= b;
        System.out.println("Swapped numbers: a = " + a + " b = " + b);
    }

    public static void task2(int n) {
        int num = n;
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        int diff = n - reversed;
        System.out.println("Difference: " + n + " - " + reversed + " = " + diff);
    }

    public static void task3(double pounds) {
        int grams = (int) (pounds * GRAMS_IN_POUND);
        int kilograms = grams / 1000;
        grams %= 1000;
        System.out.println("In " + pounds + " kilograms " + kilograms + "," + grams);
    }

     public static void task4(int deposit, int months, double percent){
        double profit = deposit * percent * months/12;
         System.out.println("Profit from " + deposit + " on " + months + " months" + ": " + profit);
    }
}
