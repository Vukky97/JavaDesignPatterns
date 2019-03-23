package factorymethod;

public class AudiFactory extends CarFactory{

    @Override
    protected Car Make() {
        return new AudiCar();
    }
    
}
