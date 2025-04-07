package shzeproject.access_control;

public class Connection {
    private int number = 1;

    private Connection() {
       
    }

    public void getMessage(){
        System.err.println("This is №" + (number++) + " connection");
    }

    protected static Connection createConnection(){
        
        return new Connection();
    }
    
}
