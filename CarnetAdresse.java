/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carnetadresse;

import DAO.DAOAdresse;
import DAO.DAOPersonne;
import beans.Adresse;
import beans.Personne;
import java.sql.Connection;

/**
 *
 * @author stagldnr
 */
public class CarnetAdresse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        MySQLConnection.getinstance();
        DAOPersonne daop = new DAOPersonne();
        DAOAdresse daoa =new DAOAdresse();
        
       Personne modif = daop.find(1);
       modif.setNom("hop");
       modif.setPrenom("LA");
       Personne persFinal = daop.update(modif);
        System.out.println("persFinal = " + persFinal);
    }
}
   
