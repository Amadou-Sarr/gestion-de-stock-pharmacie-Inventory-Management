package DAO;

import java.sql.*;

/**
 * Created by AMADOU on 27/07/2017.
 */
public class DAO {

    private static Statement stmt;
    private static Connection cnx;
    private  PreparedStatement pstmt;

    private static DAO db;

    public static DAO getInstance() {
        if (db == null) {
            db = new DAO();
        }
        return db;
    }


    public static void connect() {
        try {
            String url = "jdbc:mysql://localhost:3306/gestion_stock_memoire";
            String user = "root", pw = "";
            if (cnx == null || cnx.isClosed()) {
                Class.forName("com.mysql.jdbc.Driver");
                cnx = DriverManager.getConnection(url, user, pw);
                stmt = cnx.createStatement();
            }
        } catch (Exception ex) {
        }
    }

    public static void close() throws Exception {

        try {
            DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_stock_memoire;shutdown");
            cnx.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void addParam(int indice, Object valeur) throws SQLException {
        pstmt.setObject(indice, valeur);
    }


    public ResultSet myExecutePrepareQuery() throws Exception {
        ResultSet rs = null;
        try {

            rs = pstmt.executeQuery();
        } catch (Exception e) {
            throw e;
        }
        return rs;
    }

    public void myPrepareStatement(String sql) throws Exception {

        try {
            connect();
            if (sql.toLowerCase().trim().startsWith("insert")) {
                pstmt = cnx.prepareStatement(sql,
                        PreparedStatement.RETURN_GENERATED_KEYS);
            } else {
                pstmt = cnx.prepareStatement(sql);
            }
        } catch (Exception e) {
            throw e;
        }

    }

    public ResultSet myExecuteQuery(String sql) throws Exception {
        ResultSet rs = null;
        try {
            connect();
            rs = stmt.executeQuery(sql);
        } catch (Exception e) {
            throw e;
        }
        return rs;
    }




    public int myExecuteUpdate(String sql) throws Exception {
        int nbrow = 0;
        try {
            connect();
            nbrow = stmt.executeUpdate(sql);
        } catch (Exception e) {
            throw e;
        }
        return nbrow;
    }

}
