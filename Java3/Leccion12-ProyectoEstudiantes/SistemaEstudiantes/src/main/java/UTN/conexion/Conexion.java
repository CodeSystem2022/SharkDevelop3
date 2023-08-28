package UTN.conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conexion {
    public static Connection getConnection() {
        Connection conexion = null;
        //variables para conectarme a la base de datos
        var baseDatos = "testdb";
        var url = "jdbc:mysql://localhost:3307/" + baseDatos;
        var usuario = "root";
        var password = "admin";

        //cargamos la clase del driver de mysql en memmoria
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, password);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Ocurrio un error en la conexion: " + e.getMessage());
        } //fin catch
        return conexion;
    } //fin metodo Connection

}
