public class Main {
    public static void main(String[] args) {

        int amount = 65_000; // стоимость билета

        int percent = 20;

        int bonus = amount * percent / 100;

        System.out.println("Бонусные мили:" + bonus);
    }
}