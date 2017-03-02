package top.ygy.chapter6.access.test;

public class Connection {
	
	private static Connection connection=new Connection();  
    
    private Connection(){  
          
    }  
      
    public static Connection makeConnection(){  
        return connection;  
    }  
}
