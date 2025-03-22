import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ConexionJDBC {

    private static final String DRIVER = "org.mariadb.jdbc.Driver";
    private static final String URL_CONEXION = "jdbc:mariadb://localhost:3306/Tienda_Jaramillos";
    public static void main(String args[]) throws SQLException {
        final String usuario = "localhost";
        final String password = "1992";
        Connection dbConnection = null;
        Statement statement = null;

        try {
            Class.forName(DRIVER);
            Connection conn = DriverManager.getConnection(URL_CONEXION, usuario, password);
            String selectTableSQL = "SELECT ID,NOMBRE,APELLIDO FROM CLIENTES";
            statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(Clientes);
            while (rs.next()) {
                String id = rs.getString("ID");
                String nombre = rs.getString("NOMBRE");
                String apellidoString = rs.getString("APELLIDO");
                String cedulaString = rs.getString("CEDULA");
                System.out.println("userid : " + id);
                System.out.println("usr : " + usr);
                System.out.println("psw : " + psw);
                System.out.println("nombre : " + nombre);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            if (statement != null) {
                statement.close();
            }
            if (dbConnection != null) {
                dbConnection.close();
            }
        }
    }   
}