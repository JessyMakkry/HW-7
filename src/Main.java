public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int cash = 0;
        int month = 0;
        int pay = 15000;
        while (cash<2459000) {
            cash = cash + pay;
            month = month + 1;
            System.out.println("Месяц "+month+", сумма на счете "+cash+" рублей");
        }
        System.out.println("Task 2");
        int i=1;
        while (i<11) {
            System.out.print(i+" ");
            i = i+1;
        }
        System.out.println();
        for (i=10; i>0; i--) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Task 3");
        int people = 12000000;
        byte birthPer1000 = 17;
        byte deathPer1000 = 8;
        int helpy;
        i=0;
        do {
            helpy = people/1000;
            people = people + (birthPer1000*helpy) - (deathPer1000*helpy);
            i=i+1;
            System.out.println("Год "+i+", численность населения составляет "+people);
        } while (i<10);
        System.out.println("Task 4");
    }
}