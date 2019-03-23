package factorymethod;

public abstract class CarFactory {
    
    public Car CarMake(){
        return Make();
}
    protected abstract Car Make();
    
}
