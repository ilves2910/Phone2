/* Д/з Класс Phone.
Создайте класс Phone, который содержит переменные number, model и weight.
Создайте три экземпляра этого класса.
Выведите на консоль значения их переменных.
Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
Выводит на консоль сообщение “Звонит {name}”. Метод getNumber – возвращает номер телефона.
Вызвать эти методы для каждого из объектов.
Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации
переменных класса - number, model и weight.
Добавить конструктор, который принимает на вход два параметра для инициализации переменных
класса - number, model.
Добавить конструктор без параметров.
*/
import java.util.Scanner;
public class Main {

    Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер телефона: ");
    int number = scanner.nextInt();

        System.out.print("Введите модель телефона: ");
    int model = scanner.nextInt();

     System.out.print("Введите вес телефона: ");
    int weight = scanner.nextInt();

    Phone ph = new Phone();
    ph.setName();

    public static final int level = 1;

    public static void main(String[] args) {
        People p = new People();
        p.info();
        p.setName("Alex");
        p.setAge(30);
        p.info();

        People p2 = new People("Alex");
        p2.info();

        //People.counter = 8;

        People p3 = new People("Alex", 55);
        p3.info();

        People.getCounter();
    }
}