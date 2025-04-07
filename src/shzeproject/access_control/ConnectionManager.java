package shzeproject.access_control;

public class ConnectionManager {
    private int size = 3;
    private final Connection[] CONNECTIONS_ARRAY = new Connection[size];

    public ConnectionManager() {
        for(int i = 0; i < CONNECTIONS_ARRAY.length; i++){
            CONNECTIONS_ARRAY[i] = Connection.createConnection();
        }
    }
    
    public int getArrayLength(){
        return CONNECTIONS_ARRAY.length;
    }
    
    public Connection getConnect(){
        if( --size < 0){
            return null;
        }
        return CONNECTIONS_ARRAY[size];
    }
}
