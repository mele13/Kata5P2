package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MailListReaderBD_p2_v2 {
    
    /**
     * Método que conecta a la base de datos de SQLite.
     * 
     * @return conn conexión
     */
    private static Connection connect() {
        String url = "jdbc:sqlite:SqLite/KATA5.db"; //Cadena de conexión a SQLite
        Connection conn = null; //Conexión a la base de datos
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) { 
            System.out.println(e.getMessage());
        }   
        return conn;
    }
    
    /**
     * Método que obtiene las direcciones de email desde la base de datos.
     * 
     * @return mailList
     */
    public static List<String> read(){
        String sql = "SELECT * FROM EMAIL"; 
        List<String> mailList = new ArrayList<>();
        try (Connection conn = MailListReaderBD_p2_v2.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql);
                ResultSet resultSet = pstmt.executeQuery()) {
            while (resultSet.next()) {
                mailList.add(resultSet.getString("Mail"));
            }
        } catch (SQLException e) { 
            System.out.println(e.getMessage());
        } 
        return mailList;
    }
}