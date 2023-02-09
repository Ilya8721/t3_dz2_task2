public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int deposit = 2000;

        int bonus = deposit >= 1000 ? deposit / 100 : 0;

        System.out.println("Бонусов: " + bonus);
        System.out.println("Сумма на счету: " + (balance + deposit));

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}