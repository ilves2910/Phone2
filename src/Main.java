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
public class Main {
    public static void main(String[] args) {

        // 3 экземпляра класса Phone
        Phone ph1 = new Phone("89110000000", "Huawei",190);
        Phone ph2 = new Phone("89210000000", "Iphone");
        Phone ph3 = new Phone("89090000000");

       // вывод значений переменных класса Phone
        ph1.info();
        ph2.info();
        ph3.info();

        // Вывод имени и номера телефона
       ph1.RecieveCall("Alex");
        System.out.println(ph1.getNumber());

        ph2.RecieveCall("Dan");
        System.out.println(ph2.getNumber());

        ph3.RecieveCall("Nik");
        System.out.println(ph3.getNumber());

     }
}