/*Д/3 Доработать класс Phone. Сделать его абстрактным. Метод info() сделать абстрактным.
Также добавить классы-наследники от Phone - SamsungPhone, XiaomiPhone и ApplePhone.
Реализацию info() в каждом классе-наследнике. Создать объекты каждого класса-наследника и
проверить метод Info().*/
class SamsungPhone extends Phone {

       public SamsungPhone(String number, String model, int weight) {
        super(number, model, weight);
    }

    @Override
    public void info()
    {
        System.out.printf(getNumber() + " " + "Samsung " + getModel() + " " + "Weight " + getWeight() + "\n");
    }

    }

