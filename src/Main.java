public class Main {
    public static void main(String[] args) {
        System.out.println("задача № 1");
        for (int i = 0; i < 10; i = i + 1) {
            System.out.println("Итерация цикла " + i);
        }

        System.out.println("задача № 2");
        for (int m = 10; m > 0; m = m - 1) {
            System.out.println("Итерация цикла" + m);
        }

        System.out.println("задача № 3");
        for (int n = 0; n < 17; n = n + 2) {
            System.out.println("Итерация цикла" + n);
        }

        System.out.println("задача № 4");
        for (int v = 10; v > -10; v = v - 1) {
            System.out.println("Итерация цикла" + v);
        }

        System.out.println("задача № 5");
        for (int l = 1904; l < 2096; l = l + 4) {
            System.out.println("Итерация цикла " + l);
        }

        System.out.println("задача № 6");
        for (int k = 7; k < 105; k = k + 7) {
            System.out.println("Итерация цикла " + k);
        }

        System.out.println("задача № 7");
        for (int o = 1; o < 1024; o = o * 2) {
            System.out.println("Итерация цикла " + o);
        }

        System.out.println("задача № 8");
        int currentMonth = 29000;
        int total = 0;
        for (int f = 1; f <= 12; f = f + 1) {
            total = total + currentMonth;
            System.out.println("месяц" + f + "сумма накоплений равна" + total + "рублей");
        }
    }
}