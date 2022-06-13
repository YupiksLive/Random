public class Main {
    public static void main(String[] args) {
        for (int r : new Randoms(90, 100)) {
            System.out.println("Число: " + r);
            if (r == 100) {
                System.out.println("Выпало число 100. Завершаем");
                break;
            }
        }
    }
}