public class Main {
    public static void main(String[] args) {

        int amount = 65_000; // стоимость билета
        boolean ticket = true;

        int percent;
        if (ticket) {
            percent = 5;
        } else {
            percent = 0;
        }

        int bonus = amount * percent / 100;

        System.out.println("Бонусные мили:" + bonus);
    }
}