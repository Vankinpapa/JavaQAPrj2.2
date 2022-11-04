public class Main {
    public static void main(String[] args) {

        int initScore = 555;
        int putScore = 300;
        int bonus = putScore/100;

        if (putScore > 1000) {
            int total = initScore + putScore + bonus;
            System.out.println("Итоговая сумма вышла: " + total + ". Бонусных баллов: " + bonus);
        } else {
            int total = initScore + putScore;
            System.out.println("Итоговая сумма вышла: " + total + ". Бонусных баллов 0");
        }

    }
}