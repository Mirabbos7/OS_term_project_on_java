package org.mirabbos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Connector {
    public Connection getConnection(String url, String username, String password) throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/hotel_management_platform";
        String username = "root";
        String password = "root";

        try(Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement()){
            String sql_select = "select ClientID, FullName, Address, Phone, Username, Password from Client";
            ResultSet resultSet = statement.executeQuery(sql_select);
            List<Client> clients = new ArrayList<>();
            while (resultSet.next()){
                int id = resultSet.getInt(1);
                String fullName = resultSet.getString(2);
                String address = resultSet.getString(3);
                String phone = resultSet.getString(4);
                String Username = resultSet.getString(5);
                String Password = resultSet.getString(6);
                clients.add(new Client(id, fullName,  address, phone, Username, Password));
            }
            System.out.println(clients);

        }catch (SQLException e){
            e.printStackTrace();
        }




    }

}
