import java.util.Scanner;

public class Tasks {

    public static void Task_1 () {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num_1 = in.nextInt();

        System.out.println("Введите второе число: ");
        int num_2 = in.nextInt();

        if (num_1 == num_2) {
            System.out.println("Числа равны друг другу.");
        } else if (num_1 > num_2) {
            System.out.println("Первое число больше второго.");
        } else {
            System.out.println("Второе число больше первого.");
        }
        in.close();

    }

    public static void Task_2 () {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = in.nextInt();

        if (num < 9 && num > 2) {
            System.out.println("Число больше 2 и меньше 9");
        } else {
            System.out.println("Неизвестное число.");
        }
        in.close();
    }

    public static void Task_3 () {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите сумму вклада: ");
        int dep_sum = in.nextInt();
        double add_sum;

        if (dep_sum < 100) {
            add_sum = dep_sum * 0.05;
        } else if (dep_sum >= 100 && dep_sum <= 200) {
            add_sum = dep_sum * 0.07;
        } else {
            add_sum = dep_sum * 0.1;
        }
        dep_sum+= add_sum;
        System.out.println(dep_sum);

        in.close();
    }

    public static void Task_4 () {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер операции: 1 - сложение; 2 - вычитание; 3 - умножение");
        int oper_num = in.nextInt();

        switch (oper_num) {
            case 1:
                System.out.println("Сложение");
                break;
            case 2:
                System.out.println("Вычитание");
                break;
            case 3:
                System.out.println("Умножение");
                break;
            default:
                System.out.println("Операция не определена!");
                break;
        }

        in.close();
    }

    public static void Task_5 () {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int first_num = in.nextInt();

        System.out.println("Введите второе число: ");
        int second_num = in.nextInt();

        System.out.println("Введите номер операции: 1 - сложение; 2 - вычитание; 3 - умножение");
        int oper_num = in.nextInt();

        switch (oper_num) {
            case 1:
                System.out.printf("Результат операции: %d", first_num + second_num);
                break;
            case 2:
                System.out.printf("Результат операции: %d", first_num - second_num);
                break;
            case 3:
                System.out.printf("Результат операции: %d", first_num * second_num);
                break;
            default:
                System.out.println("Операция не определена!");
                break;
        }

        in.close();
    }

    public static void Task_6() { //Loop

        int population = 10000000;
        int born_ppl = 14;
        int dead_ppl = 8;

        for (int i = 1; i <= 10; i++) {
            population += population * (born_ppl - dead_ppl) / 1000;
            System.out.println(population);
        }
    }

    /* [модификаторы] тип_возвращаемого_значения название_метода ([параметры])
    *  public и static - модификаторы
    *  Чтобы вызвать метод (или иной объект) из под main или любого иного внешнего класса, вызываемый объект всегда должен быть статичен - static
    *  Ключевое слово void указывает на то, что метод ничего не возвращает. */
    public static void Task_7() { //Loop

        for (int i = 1; i <= 9; i++) {
            for (int k = 1; k <= 9; k++) {
                System.out.printf("%d\t", i * k);
            }
            System.out.println();
        }
    }

}
