import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

//        Scanner Click_Clack = new Scanner(System.in);
//        System.out.println("Напишите Ваше имя: ");
//        String Name = ClickClack.nextLine();
//        System.out.println("Добро пожаловать в мир Java, " + Name + "!");

        /* Самостоятельные упражнения */
//        Tasks.Task_1();
//        Tasks.Task_2();
//        Tasks.Task_3();
//        Tasks.Task_4();
//        Tasks.Task_5();
//        Tasks.Task_6();
//        Tasks.Task_7();


        /* Примеры кода */
//        Examples.Example_1();
//        Examples.Example_2();
//        Examples.Example_3();

        /* Доп. примеры */

        Person bob = new Person();      // вызов первого конструктора без параметров
        bob.displayInfo();

        Person tom = new Person("Tom"); // вызов второго конструктора с одним параметром
        tom.displayInfo();

        Person sam = new Person("Sam", 25); // вызов третьего конструктора с двумя параметрами
        sam.displayInfo();
    }
}
class Person{

    String name;    // имя
    int age;        // возраст
    Person()
    {
        name = "Undefined";
        age = 18;
    }
    Person(String n)
    {
        name = n;
        age = 18;
    }
    Person(String n, int a)
    {
        name = n;
        age = a;
    }
    void displayInfo(){
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }
}
