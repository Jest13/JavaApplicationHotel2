package javaapplicationhotel2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;

/**
 *
 * @author camil
 */
public class Connecter {
    Connection con; 
    public Connecter() {
      try{
      Class.forName("com.mysql.cj.jdbc.Driver");
      }catch(ClassNotFoundException e){
          System.err.println(e);
                  
                  
    }
    try{
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","");
    }catch(SQLException e){System.err.println(e);}
    }
    Connection obtenirconnexion(){return con;}

    PreparedStatement prepareStatement(String select__from_classe) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}