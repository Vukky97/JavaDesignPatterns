package builder;

public class Person {
    
    private String name;
    
    public void SetName(String name){
        this.name = name;
    }
    public String GetName()
    {
        return name;
    }
    
    private int age;
    
    public void SetAge(int age){
        this.age = age;
    }
    public int GetAge(){
        return age;
    }
    
    public Person(){
        this.name = "";
        this.age = 0;
    }
    
    public Person(String name,int age)
    {
        this.name = name;
        this.age = age;
    }
    
}
