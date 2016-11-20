package com.sasha.SE_10.Task1;

import java.sql.*;

/**
 * Created by Александра on 20.11.2016.
 */
public class Task1 {
    static Connection connection = null;
    static ResultSet result = null;

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javastudy", "root", "1327");
            System.out.println("Connection is success");

            dropTableNames();
            createTableNames();
            insertRowToNames(1, "Sasha");
            insertRowToNames(2, "Nikita");
            insertRowToNames(3, "Dima");
            insertRowToNames(4, "Natasha");
            selectNameById(2);
            updateNameInNames("Sasha", "Alex");
            selectTable();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                    System.out.println("Connection is closed");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void createTableNames() throws SQLException {
        String sql = "CREATE TABLE `javastudy`.`names` (" +
                "  `ID` INT NOT NULL AUTO_INCREMENT," +
                "  `NAME` VARCHAR(45) NOT NULL," +
                "  PRIMARY KEY (`ID`)," +
                "  UNIQUE INDEX `ID_UNIQUE` (`ID` ASC));";
        Statement st = connection.createStatement();
        st.executeUpdate(sql);
        System.out.println("Table is created");
    }

    public static void dropTableNames() throws SQLException {
        String sql = "DROP TABLE names";
        Statement st = connection.createStatement();
        st.executeUpdate(sql);
        System.out.println("Table is dropped");
    }

    public static void updateNameInNames(String nameFrom, String nameTo) throws SQLException {
        String sql = "UPDATE names SET name=? WHERE name=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, nameTo);
        ps.setString(2, nameFrom);
        int rows = ps.executeUpdate();
        System.out.println(rows + " rows are updated");
    }

    public static void selectNameById(int id) throws SQLException {
        String sql = "SELECT * FROM names WHERE id=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, id);
        result = ps.executeQuery();
        System.out.println("Result is:");
        while (result.next()) {
            System.out.println(result.getInt(1) + " " + result.getString(2));
        }
    }

    public static void selectTable() throws SQLException {
        String sql = "SELECT * FROM names";
        PreparedStatement ps = connection.prepareStatement(sql);
        result = ps.executeQuery();
        System.out.println("Result is:");
        while (result.next()) {
            System.out.println(result.getInt(1) + " " + result.getString(2));
        }
    }

    public static void insertRowToNames(int id, String name) throws SQLException {
        String sql = "INSERT INTO names(ID, NAME) VALUES(?, ?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, id);
        ps.setString(2, name);
        ps.executeUpdate();
        System.out.println("Row is inserted");
    }


}
