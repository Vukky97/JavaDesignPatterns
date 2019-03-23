package builder;

public class PersonBuilder {
    private Person person;
    
    public PersonBuilder SetName(String name){
        this.person.SetName(name);
        return this;
    }
    
    public PersonBuilder SetAge(int age){
        this.person.SetAge(age);
        return this;
    }
    
    public Person Build(){
        return person;
    }
    
    public PersonBuilder(){
        this.person = new Person();
    }
    
}
