public class Main {
    public static void main(String[] args) {
        int Start = 100;
        int Popolnenie = 2000;

        int bonus = Popolnenie >= 1000 ? Popolnenie / 100 : 0;

        System.out.println("Бонусов: " + bonus);
        System.out.println("Сумма на счету: " + (Start + Popolnenie));

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}