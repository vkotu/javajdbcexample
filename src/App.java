import com.util.ConnectionConfiguration;
import sun.reflect.annotation.ExceptionProxy;

import java.sql.Connection;

/**
 * Created by kotu on 8/16/16.
 */
public class App {

    public static void main(String[] args) {

        Connection connection = null;
        try {
            connection = ConnectionConfiguration.getConnection();
            if(connection != null) {
                System.out.println("Connection established!");
            }
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            if(connection != null) {
                try{
                    connection.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }

    }
}
