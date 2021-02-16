public class TestFor2 {
    public static void main(String[] args) {
        for (int i = 100; i >= 1; i--) {
            if (i % 4 == 0) {
                System.out.println(i);
            }
        }

        System.out.println();

        int n = 4;
        for (int i = 1; i <= n; i++) {
            System.out.println(i * i);
        }

        System.out.println();

        int valueX = 20;
        int valueY = 40;
        int sum = 0;
        int count = 0;

        for (int i = valueX; i <= valueY; i++) {
            count++;
            sum += i;
        }
        System.out.println(sum / count);
    }
}
