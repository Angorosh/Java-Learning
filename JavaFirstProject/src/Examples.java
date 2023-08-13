import java.util.Scanner;
public class Examples {

    public static void Example_1 () {
        for (int i = 0; i <= 10; i++){
            if (i == 5) //В данном примере фигурные скобки не являются обязательными для условной конструкции
                break;
            System.out.println(i);
        }
    }

    public static void Example_2 () {
        try{
            int[] numbers = new int[3];
            numbers[4]=45;
            System.out.println(numbers[4]);
            System.out.println("Программа завершена успешно!");
        }
        catch(Exception ex){

            ex.printStackTrace();

            System.out.println("Программа завершена с ошибкой!");
        }

    }

    public static void Example_3 () {

        try{
            Scanner in = new Scanner(System.in);
            int x = in.nextInt();
            if(x>=30){
                throw new Exception("Число х должно быть меньше 30");
            }
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
        System.out.println("Программа завершена");

    }
}
