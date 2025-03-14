//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println( i );
        }

        for (int i = 10; i >= 1; i--) {
            System.out.println( i );
        }

        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println( i );
        }

        for (int i = 10; i >= -10; i--) {
            System.out.println( i );
        }

        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }

        for (int i = 7; i <= 100; i = i + 7) {
            System.out.println( i );
        }

        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println( i );
        }

        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println( i );
        }

        int zp = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + zp;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }

        int zp2 = 29000;
        int total2 = 0;
        for (int i = 1; i <= 12; i++) {
            total2 = total2 + zp2 + (total2/100);
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total2 + " рублей");
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println("2*" + i + "=" + (i * 2) );
        }
    }
}
