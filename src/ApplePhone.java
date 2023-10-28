class ApplePhone extends Phone {

    public ApplePhone(String number, String model, int weight) {

        super(number, model, weight);
    }

    @Override
    public void info() {
        System.out.printf(getNumber() + " " + "Apple " + getModel() + " " + "Weight " + getWeight() + "\n");
    }
}