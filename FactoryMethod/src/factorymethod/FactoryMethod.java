package factorymethod;

public class FactoryMethod {

    public static void main(String[] args) {
       CarFactory BmwCarFactory = new BmwFactory();
       CarFactory AudiCarFactory = new AudiFactory();
       
       Car[] cars = new Car[10];
        for (int i = 0; i < 5; i++) {
            cars[i] = BmwCarFactory.CarMake();
            cars[i].Info();
        }
        for (int i = 0; i < 5; i++) {
            cars[i] = AudiCarFactory.Make();
            cars[i].Info();
        }
    }
    
}
