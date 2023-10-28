class XiaomiPhone extends Phone {

    public XiaomiPhone(String number,String model,int weight) {
        super(number, model, weight);
    }

    @Override
    public void info()
    {
        System.out.printf(getNumber() + " " + "Xiaomi " + getModel() + " " + "Weight " + getWeight() + "\n");
    }
}