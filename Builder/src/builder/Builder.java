package builder;

public class Builder {

    public static void main(String[] args) {
       PersonBuilder builder = new PersonBuilder();
       Person p1 = builder.SetName("John").SetAge(23).Build();
       
       System.out.println("The Builded Person's name is: " + p1.GetName());
       System.out.println("The Builded Person's age is: " + p1.GetAge());
     
    }
    
}
