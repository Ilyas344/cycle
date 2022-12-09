public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1\n");
        int savings =0; int i=0; int money=15000;
        int salary = 15000;
        while (savings<=2459000){
            savings = savings + savings / 100;
            savings = savings + salary;
            System.out.println("Месяц "+(++i)+", сумма накоплений равна "+savings+" рублей");
        }
        System.out.println("\nЗадача 2\n");
        i=0;

        while (i<10){
            System.out.printf("%d ",++i);
        }System.out.println("");
        for ( i=10;i>0;i--)
            System.out.printf("%d ",i);
        System.out.println("\n\nЗадача 3\n");
        int people =12_000_000;
        int birthrate=17;
        int mortality=8;
        i=0;
        while (i<10){
            people= people+(people/1000*birthrate)-(people/1000*mortality);
            System.out.println("Год "+(++i)+", численность населения составляет "+people);
        }
        System.out.println("\n\nЗадача 4\n");
        double sum=15000;
        i=0;
        while (sum<12_000_000){
            sum = sum + sum * 0.07;
            System.out.printf("Месяц %d сумма накоплений %.2f руб.\n",++i,sum);
        }

        System.out.println("\n\nЗадача 5\n");
        sum=15000;i=0;
        while (sum<12000000){
            sum = sum + sum * 0.07;
            i++;
            if(i%6==0)System.out.printf("Месяц %d сумма накоплений %.2f руб.\n",i,sum);
        }
        System.out.println("\n\nЗадача 6\n");
        sum=15000;
        i=0;
        while (i<108){
            sum = sum + sum * 0.07;
            i++;
            if(i%6==0)System.out.printf("Месяц %d сумма накоплений %.2f руб.\n",i,sum);
        }
        System.out.println("\n\nЗадача 7\n");
        int friday =2;
        int day =31;
        i=0;
        while (true){
            i++;
            if (i==friday) {
                System.out.println("Ура. Сегодня пятница. " + i + " число. Готовь отчёт");
                friday+=7;
            }
            else if (i==day) break;
        }
        System.out.println("\n\nЗадача 8\n");
        int year=0;
        while (true)
        {year+=79;
            if (year>=1822 && year<=2122) System.out.println(year);
            if (year>2122) break;
        }

    }
}