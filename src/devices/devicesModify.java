/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package devices;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Anhdt993<https://anhdt2093.000webhostapp.com>
 */
public class devicesModify {
     public static List<devices> findAll() {
        List<devices> DEVICEList = new ArrayList<>();
        
        Connection connection = null;
        Statement statement = null;
        
        try {
            //lay tat ca danh sach devices
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlykho", "root", "");
            
            //query
            String sql = "select * from devices";
            statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery(sql);
            
            while (resultSet.next()) {                
                devices d = new devices(resultSet.getInt("idSite"), 
                        resultSet.getString("serviceTag"), resultSet.getString("producer"), 
                        resultSet.getString("model"),resultSet.getString("state"),
                        resultSet.getInt("idContractors"));
                DEVICEList.add(d);
            }
        } catch (SQLException ex) {
            Logger.getLogger(devicesModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(devicesModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(devicesModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return DEVICEList;

     }
     public static void insert(devices dvl){
        Connection connection = null;
        PreparedStatement statement = null;
        try{
              
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlykho", "root", "");
            //query
            String sql = "insert into devices(IdSite, serviceTag, producer, model, state, idContractors) values(?, ?, ?, ?, ?, ?)";
            statement = connection.prepareCall(sql);
            
            statement.setInt(1, dvl.getIdSite());
            statement.setString(2, dvl.getServiceTag());
            statement.setString(3, dvl.getProducer());
            statement.setString(4, dvl.getModel());
            statement.setString(5, dvl.getState());
            statement.setInt(6, dvl.getIdContractors());
            //statement.setInt(6, dvl.getIdSite());
            
            statement.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(devicesModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(devicesModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(devicesModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
     
     public static void delete(int IdSite) {
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlykho", "root", "");
            
            //query
            String sql = "delete from devices where IdSite = ?";
            statement = connection.prepareCall(sql);
            
            statement.setInt(1, IdSite);
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(devicesModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(devicesModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(devicesModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
     }
}
