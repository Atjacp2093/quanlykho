/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sitepac;

import devices.devices;
import java.sql.Connection;
import java.sql.DriverManager;
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
public class siteModify {
    public static List<site> findAll() {
        List<site> SiteList = new ArrayList<>();
        
        Connection connection = null;
        Statement statement = null;
        
        try {
            //lay tat ca danh sach site
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlykho", "root", "");
            
            //query
            String sql = "select * from site";
            statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery(sql);
            
            while (resultSet.next()) {                
                site s = new site(resultSet.getInt("idSite"), 
                        resultSet.getString("name"), resultSet.getString("address"), 
                        resultSet.getString("contactName"),resultSet.getString("phoneNumber"),resultSet.getString("created_at"),
                        resultSet.getInt("country_code"));
                SiteList.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(siteModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(siteModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(siteModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return SiteList;

     }
}
