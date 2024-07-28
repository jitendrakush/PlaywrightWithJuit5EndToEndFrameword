package Factory;

import java.sql.Connection;
import java.sql.Statement;

public class DatabaseFactory {

    public static ThreadLocal<Connection> threadLocalConnection= new ThreadLocal<>();
    public static ThreadLocal<Statement> threadLocalStatement= new ThreadLocal<>();


    public Connection getConnection(){
        return threadLocalConnection.get();
    }

    public void setConnection(Connection connection){
        threadLocalConnection.set(connection);
    }

    public Statement getStatement(){
        return threadLocalStatement.get();
    }
 }
