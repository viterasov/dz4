public class Main {
    public static void main(String[] args) {
        // задание 1
        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        for (i = -10; i < 0; i++) {
            System.out.println(-i);

            // задание 2
        }
        for (int b = 2; b < 32; b = b + 7)
            System.out.println("Сегодня пятница " + b + " число. Необходимо подготовить отчет");

        // задание 3
        for (int n = 0; n < 2121; n = n + 79)
            if (n < 2121)
                if (n > 1821) {
                    System.out.println(n + " комета продетала рядом с землей");


                }
        // задание 4
        for (int f = 1; f < 31; f++) {
            if (f % 5 == 0 && f % 3 == 0)
                System.out.println(f + " ping pong");
            if (f % 5 == 0 && f % 3 != 0)
                System.out.println(f + " pong");
            if (f % 3 == 0 && f % 5 != 0)
                System.out.println(f + " ping");
            if (f % 3 != 0 && f % 5 != 0)
                System.out.println(f);

        }
    }
}