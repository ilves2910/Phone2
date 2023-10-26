public class Phone {
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
    private String number;
    private String model;
    private int weight;

    // Конструктор с 3 параметрами
    public Phone(String number, String model, int weight)
    {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    // Конструктор с 2 параметрами
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
        this.weight = 0;
    }

   // Конструктор с одним параметром
    public Phone(String number) {
        this.number = "No number";
        this.model = "No model";
        this.weight = 0;
    }

    // Метод, кто звонит
    public void RecieveCall(String Name)
    {
         System.out.print("Звонит: " + Name + " ");
    }

    // Метод, возвращающий номер
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight)
        {
            if (weight > 0) {
                this.weight = weight;
            }
        }


    void info()
    {
        System.out.printf("Number: %s \tModel: %s \tWeigth %d \n", number, model, weight);
    }


}