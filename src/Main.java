public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int cash = 0;
        int month = 0;
        int pay = 15000;
        while (cash < 2459000) {
            cash = cash + pay;
            month = month + 1;
            System.out.println("Месяц " + month + ", сумма на счете " + cash + " рублей");
        }
        System.out.println("Task 2");
        int i = 1;
        while (i < 11) {
            System.out.print(i + " ");
            i = i + 1;
        }
        System.out.println();
        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Task 3");
        int people = 12000000;
        byte birthPer1000 = 17;
        byte deathPer1000 = 8;
        int helpy;
        i = 0;
        do {
            helpy = people / 1000;
            people = people + (birthPer1000 * helpy) - (deathPer1000 * helpy);
            i = i + 1;
            System.out.println("Год " + i + ", численность населения составляет " + people);
        } while (i < 10);
        System.out.println("Task 4");
        float cashVas = 15000f;
        float proc = 1.07f;
        i = 0;
        while (cashVas < 12000000) {
            cashVas = cashVas * proc;
            i++;
            System.out.println("За " + i + "-й месяц сумма составит " + cashVas + " рублей");
        }
        System.out.println("Task 5");
        cashVas = 15000f;
        i = 0;
        byte hih;
        while (cashVas < 12000000) {
            cashVas = cashVas * proc;
            i++;
            hih = (byte) (i % 6);
            if (hih == 0) {
                System.out.println("За " + i + "-й месяц сумма составит " + cashVas + " рублей");
            }
        }
        System.out.println("Task 6");
        cashVas = 15000f;
        i = 0;
        do {
            cashVas = cashVas * proc;
            i++;
            hih = (byte) (i % 6);
            if (hih == 0) {
                System.out.println("За " + i + "-й месяц сумма составит " + cashVas + " рублей");
            }
        } while (i < 108);
        System.out.println("Task 7");
        int Friday = 3;
        i = 1;
        do {
            hih = (byte) (i - Friday);
            hih = (byte) (hih % 7);
            if (hih == 0) {
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчёт");
            }
            i++;
        } while (i <= 31);
        System.out.println("Task 8");
        byte commet = 79;
        int start = 2024-200;
        int end = 2024+100;
        i=start;
        do {
            hih= (byte) (i%commet);
            i++;
        } while (hih!=0);
        i--; //Мне кажется, или это костыль?))
        while (i<=end) {
            System.out.println(i);
            i=i+commet;
        }
    }
}