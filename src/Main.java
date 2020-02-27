public class Main {
    public static void main(String[] args) {
        Car audi = new Car();
        audi.setCountryOfCar("Made in Germany");
        audi.setMaker("Maker - VW group");
        audi.setModel("Model R8");
        audi.info();
        Car bmw = new Car();
        bmw.setCountryOfCar("Made in Germany");
        bmw.setMaker("Maker - BMW group");
        bmw.setModel("Model 750L");
        bmw.info();
        Car tesla = new Car();
        tesla.setCountryOfCar("Made in USA");
        tesla.setMaker("Maker - Tesla");
        tesla.setModel("Model Y");
        tesla.info();
    }
}

class Car {
    private String countryOfCar;
    private String model;
    private String maker;

    public void setCountryOfCar(String countryOfCar) {
        this.countryOfCar = countryOfCar;
    }

    public String getCountryOfCar() {
        return countryOfCar;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getMaker() {
        return maker;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
    void info() {
        System.out.println(countryOfCar + " " + model + " " + maker);
    }
}
