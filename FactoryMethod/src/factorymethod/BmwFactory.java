package factorymethod;

public class BmwFactory extends CarFactory {

    @Override
    protected Car Make() {
        return new BmwCar();
    }
    
}
