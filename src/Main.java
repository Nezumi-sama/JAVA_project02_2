public class Main {
    public static void main(String[] args) {
        //объявляем переменные и вводим данные
        int score = 100;
        int add = 1100;
        int bonus = 0;

        //рассчет
        if (add > 1000) {
            bonus = add / 100;
        }
        score = score + add + bonus;
        System.out.println("Счет: " + score);
        System.out.println("Бонус: " + bonus);
    }
}
