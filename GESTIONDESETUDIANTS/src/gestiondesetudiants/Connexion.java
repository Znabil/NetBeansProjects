/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiondesetudiants;
import java.sql.*;
/**
 *
 * @author hp
 */
public class Connexion {
    Connection con;
    String Urlpilote="oracle.jdbc.driver.OracleDriver";// chemin de chargement de pilote oracle
    String Urlbasedonnees="jdbc:oracle:thin:@localhost:1521:ORCL";// chemin de connexion à la base de données
    public Connexion(){
        // charger le pilote de connexion
         
        try {
            Class.forName(Urlpilote);
            System.out.println("pilote chargé avec succes");
        }
        catch (ClassNotFoundException ex)
        {
            System.out.println(ex);
        }
    
        // connexion à la base de données 
        try {
            con=DriverManager.getConnection(Urlbasedonnees,"NABIL","sys");
             System.out.println("connexion al base de données")  ;
        }
        catch(SQLException ex)
        {
            System.out.println(ex);
        }
    }
        Connection obtennirConnexion(){
        return con;
    }
  
   
    
    
    
    
}
