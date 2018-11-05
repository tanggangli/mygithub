package Test.itcast.Utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class utils {
    private static DataSource ds=null;
    static {

        Properties pr=new Properties();
        InputStream res = utils.class.getClassLoader().getResourceAsStream("diure.properties");
        try {
            pr.load(res);
             ds= DruidDataSourceFactory.createDataSource(pr);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static DataSource getDs(){
        return ds;
    }
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }
}
