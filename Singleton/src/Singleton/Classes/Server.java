package Singleton.Classes;

public class Server {
    private static Server instance;
    
    public static Server GetInstance()
    {
            if(instance == null)
            {
                instance = new Server();
            }
            return instance;
    }
   
}
