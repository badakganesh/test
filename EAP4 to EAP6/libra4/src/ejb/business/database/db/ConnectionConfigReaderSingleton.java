package business.database.db;

import java.io.*;

public class ConnectionConfigReaderSingleton {

private static ConnectionConfigReaderSingleton config;

private String configFile = "/configFile.txt" ;
private static String url;
private static String driver;

protected ConnectionConfigReaderSingleton () {

System.out.println( "\n\n\n\n\n\n\n\n\n\ncurrent directory : " + System.getProperty("user.dir") ) ;

System.out.println("\n\nReading the configuration file... ");
try {
RandomAccessFile r = new RandomAccessFile(configFile,"r");
driver = r.readLine() ;
url = r.readLine() ;
System.out.println("url:" + url);
System.out.println("driver:" + driver);

}

catch(IOException e) {
System.out.println("Not able to open the database properties file, Exception msg: " + e.toString() );

}


}

public static String getUrl() {

if(config == null) {
config = new ConnectionConfigReaderSingleton();
}
return url;
}

public static String  getDriver() {

if(config == null) {
config = new ConnectionConfigReaderSingleton();
}
return driver;
}


}
